package com.wuyou.entity;

public class CommentWithBLOBs extends Comment {
    private String content;

    private String img;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}