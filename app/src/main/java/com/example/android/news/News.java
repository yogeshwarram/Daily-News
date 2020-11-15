package com.example.android.news;

public class News {
    private String mTitle;
    private String mSectionName;
    private String mUrl;
    public News(String title,String sectionName, String url){
        mTitle=title;
        mSectionName=sectionName;
        mUrl=url;
    }
    public String getTitleName(){return mTitle;}
    public String getSectionName(){return mSectionName;}
    public String getUrl(){return mUrl;}
}
