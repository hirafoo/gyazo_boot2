package com.example.gyazo_boot2.controller;

import com.example.gyazo_boot2.service.ImageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.security.MessageDigest;

@RestController
public class ApiController {

    @Autowired
    ImageService imageService;

    private static Logger log = LoggerFactory.getLogger(ApiController.class);

    @RequestMapping(value = "/api/upload", method = RequestMethod.POST)
    String upload(
            @RequestParam("imagedata") MultipartFile multipartFile
    ) {
        log.info("original file is " + multipartFile.getOriginalFilename());
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");

            byte[] bytes = multipartFile.getBytes();
            byte[] hash = digest.digest(bytes);
            String returnUrl = imageService.createByBytes(bytes, hash);
            return returnUrl;
        } catch (Exception e) {
            // 残念でした
        } catch (Throwable t) {
            // 残念でした
        }
        return "/fail";
    }
}
