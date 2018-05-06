package com.f22pkj31.crud.bean;

public class Teacher {
    private Integer t;

    private String tname;

    public Integer getT() {
        return t;
    }

    public void setT(Integer t) {
        this.t = t;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }
}