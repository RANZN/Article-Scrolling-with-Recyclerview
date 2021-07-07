package com.ranzan.articlescrollingwithrecyclerview;

public class Article {
    private int ImageId;
    private String title;
    private String context;

    public Article(int imageId, String title, String context) {
        ImageId = imageId;
        this.title = title;
        this.context = context;
    }

    public int getImageId() {
        return ImageId;
    }

    public String getTitle() {
        return title;
    }

    public String getContext() {
        return context;
    }
}
