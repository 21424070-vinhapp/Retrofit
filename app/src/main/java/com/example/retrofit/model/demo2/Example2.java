package com.example.retrofit.model.demo2;

import com.example.retrofit.model.demo2.Danhsach;

import java.util.List;

public class Example2 {


    private List<Danhsach> danhsach = null;

    public List<Danhsach> getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(List<Danhsach> danhsach) {
        this.danhsach = danhsach;
    }

    @Override
    public String toString() {
        return "Example2{" +
                "danhsach=" + danhsach +
                '}';
    }
}