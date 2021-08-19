package com.example.news;

public class News {

    private String mHeading;

    private String mDescription;


    News(String heading, String description) {
        mHeading = heading;
        mDescription = description;
    }

    public String getHeading() {
        return mHeading;
    }

    public String getDescription() {
        return mDescription;
    }
}
