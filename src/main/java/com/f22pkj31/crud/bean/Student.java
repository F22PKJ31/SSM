package com.f22pkj31.crud.bean;

public class Student {
    private Integer s;

    private String sname;

    private Integer sage;

    private String ssex;

    public Integer getS() {
        return s;
    }

    public void setS(Integer s) {
        this.s = s;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }
}