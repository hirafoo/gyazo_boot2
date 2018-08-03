package com.example.gyazo_boot2.entity;

import lombok.Data;

@Data
public class Image {
    private int    id;
    private String hash;
    private int    createdAt;

    public String url(String baseUrl) {
        return baseUrl + "images/" + this.hash + ".png";
    }
}
