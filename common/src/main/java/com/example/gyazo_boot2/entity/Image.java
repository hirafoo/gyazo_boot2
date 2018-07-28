package com.example.gyazo_boot2.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Image {

    //@Value("${base_url}")
    //private String baseUrl;

    private int    id;
    private String hash;
    private int    createdAt;

    public String url(String baseUrl) {
        return baseUrl + "images/" + this.hash + ".png";
    }
}
