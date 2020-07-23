package com.lwm.instagramui;

public class Title{

    String username;
    int imgResource;

    public Title(String username, int imgResource) {
        this.username = username;
        this.imgResource = imgResource;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }
}
