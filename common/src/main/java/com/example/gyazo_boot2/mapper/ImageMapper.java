package com.example.gyazo_boot2.mapper;

import com.example.gyazo_boot2.entity.Image;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ImageMapper {
    @Insert("INSERT INTO image (id, hash, created_at) VALUES (#{id}, #{hash}, #{createdAt})")
    @Options(useGeneratedKeys = true)
    int insert(Image image);

    @Select("SELECT * FROM image WHERE id = #{id}")
    Image selectOne(int id);

    @Select("SELECT * FROM image ORDER BY id ASC")
    List<Image> selectAll();

    @Delete("DELETE FROM image WHERE id=#{id}")
    void delete(int id);

    @Update("UPDATE image SET hash=#{hash} WHERE id=#{id}")
    void update(Image image);
}
