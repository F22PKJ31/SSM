package com.f22pkj31.crud.bean;

public class Course {
    private Integer c;

    private String cname;

    private Integer t;

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Integer getT() {
        return t;
    }

    public void setT(Integer t) {
        this.t = t;
    }
}