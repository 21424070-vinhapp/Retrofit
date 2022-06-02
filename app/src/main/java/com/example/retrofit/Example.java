package com.example.retrofit;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Example {
    private String monhoc;
    private String noihoc;
    private String website;
    private String fanpage;
    private String logo;

    public String getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }

    public String getNoihoc() {
        return noihoc;
    }

    public void setNoihoc(String noihoc) {
        this.noihoc = noihoc;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFanpage() {
        return fanpage;
    }

    public void setFanpage(String fanpage) {
        this.fanpage = fanpage;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Example{" +
                "monhoc='" + monhoc + '\'' +
                ", noihoc='" + noihoc + '\'' +
                ", website='" + website + '\'' +
                ", fanpage='" + fanpage + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}