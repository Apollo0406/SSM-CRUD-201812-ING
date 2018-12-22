package com.bean;

public class Student {
    private Integer stuId;

    private String stuName;

    private String stuSex;

    private Integer stuCounId;

    private Integer stuUniId;

    private Integer stuMajorId;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public Integer getStuCounId() {
        return stuCounId;
    }

    public void setStuCounId(Integer stuCounId) {
        this.stuCounId = stuCounId;
    }

    public Integer getStuUniId() {
        return stuUniId;
    }

    public void setStuUniId(Integer stuUniId) {
        this.stuUniId = stuUniId;
    }

    public Integer getStuMajorId() {
        return stuMajorId;
    }

    public void setStuMajorId(Integer stuMajorId) {
        this.stuMajorId = stuMajorId;
    }
}