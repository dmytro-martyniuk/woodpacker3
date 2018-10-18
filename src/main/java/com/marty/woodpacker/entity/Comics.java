package com.marty.woodpacker.entity;

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

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getSafe_title() {
        return safe_title;
    }

    public void setSafe_title(String safe_title) {
        this.safe_title = safe_title;
    }

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
