package com.bean;

public class Major {
    private Integer majorId;

    private String majorName;

    public Integer getMajorId() {
        return majorId;
    }
    
    //����޲κʹ��εĹ��캯��
    public Major(){}
    
    public Major(String name){
    	majorName = name;
    }
    
    public Major(Integer majorId,String majorName){
    	this.majorId = majorId;
    	this.majorName = majorName;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }
}