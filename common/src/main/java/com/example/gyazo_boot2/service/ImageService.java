package com.example.gyazo_boot2.service;

import com.example.gyazo_boot2.entity.Image;
import com.example.gyazo_boot2.mapper.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.io.*;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;

@Service
@Transactional
public class ImageService {
    @Autowired
    ImageMapper imageMapper;

    @Value("${base_url}")
    private String baseUrl;

    @Value("${image_base_dir}")
    private String imageBaseDir;

    private static Logger log = LoggerFactory.getLogger(ImageService.class);

    public String createByBytes(byte[] bytes, byte[] hash) {
        try {
            String hexString = DigestUtils.md5DigestAsHex(hash);
            File uploadFile = new File(imageBaseDir + hexString + ".png");
            BufferedOutputStream uploadFileStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
            uploadFileStream.write(bytes);
            uploadFileStream.close();

            Image image = new Image();
            image.setHash(hexString);

            Date date = new Date();
            int createdAt = (int)(new Date().getTime()/1000);
            image.setCreatedAt(createdAt);
            this.insert(image);
            return baseUrl + "images/" + hexString + ".png";
        } catch (Exception e) {
            // 残念でした
            log.info("insert fail");
            log.info(e.toString());
            return "/fail";
        } catch (Throwable t) {
            return "/fail";
            // 残念でした
        }
    }
    public int insert(Image image) {
        return imageMapper.insert(image);
    }

    public Image selectOne(int id) {
        return imageMapper.selectOne(id);
    }

    public List<Image> selectAll() {
        return imageMapper.selectAll();
    }

    public void delete(int id) {
        imageMapper.delete(id);
    }

    public void update(Image image) {
        imageMapper.update(image);
    }
}
