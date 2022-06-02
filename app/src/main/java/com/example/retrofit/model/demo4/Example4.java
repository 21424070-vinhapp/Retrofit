package com.example.retrofit.model.demo4;

public class Example4 {
    private String khoahoc;
    private String hocphi;

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }

    public String getHocphi() {
        return hocphi;
    }

    public void setHocphi(String hocphi) {
        this.hocphi = hocphi;
    }

    @Override
    public String toString() {
        return "Example4{" +
                "khoahoc='" + khoahoc + '\'' +
                ", hocphi='" + hocphi + '\'' +
                '}';
    }
}