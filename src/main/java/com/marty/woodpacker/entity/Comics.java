package com.marty.woodpacker.entity;

import lombok.Data;

@Data

public class Comics {

    private int month;
    private int num;
    private String link;
    private int year;
    private String news;
    private String safe_title;
    private String transcript;
    private String alt;
    private String img;
    private String title;
    private String day;

    public Comics() {

    }
    public Comics(int month, int num, String link, int year, String news, String safe_title, String transcript, String alt, String img, String title, String day) {
        this.month = month;
        this.num = num;
        this.link = link;
        this.year = year;
        this.news = news;
        this.safe_title = safe_title;
        this.transcript = transcript;
        this.alt = alt;
        this.img = img;
        this.title = title;
        this.day = day;
    }

}
