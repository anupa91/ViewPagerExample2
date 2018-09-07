package com.an.viewpagerexample2.dto;

import java.io.Serializable;

public class BeanNews implements Serializable {

    private int newsId;
    private String newsTitle, newsDateTime, newsDescription;

    public BeanNews() {
    }

    public BeanNews(int newsId, String newsTitle, String newsDateTime, String newsDescription) {
        this.newsId = newsId;
        this.newsTitle = newsTitle;
        this.newsDateTime = newsDateTime;
        this.newsDescription = newsDescription;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsDateTime() {
        return newsDateTime;
    }

    public void setNewsDateTime(String newsDateTime) {
        this.newsDateTime = newsDateTime;
    }

    public String getNewsDescription() {
        return newsDescription;
    }

    public void setNewsDescription(String newsDescription) {
        this.newsDescription = newsDescription;
    }
}
