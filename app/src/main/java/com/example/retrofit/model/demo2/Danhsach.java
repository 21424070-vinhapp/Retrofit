package com.example.retrofit.model.demo2;

public class Danhsach {

    private String khoahoc;

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }

    @Override
    public String toString() {
        return "Danhsach{" +
                "khoahoc='" + khoahoc + '\'' +
                '}';
    }
}