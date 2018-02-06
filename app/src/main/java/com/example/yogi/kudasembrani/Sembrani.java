package com.example.yogi.kudasembrani;

/**
 * Created by yogi on 05/02/18.
 */

public class Sembrani {

    String title, subtitle;
    Integer imgUrl;

    public Sembrani(int imgUrl, String title, String subtitle) {
        this.imgUrl = imgUrl;
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Integer imgUrl) {
        this.imgUrl = imgUrl;
    }
}

