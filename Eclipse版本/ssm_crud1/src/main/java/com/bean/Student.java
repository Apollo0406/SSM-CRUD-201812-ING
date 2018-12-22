package com.bean;

public class Student {
    private Integer stuId;

    private String stuName;

    private String gender;

    private String email;

    private Integer mId;

    //新增Major类的属性,并加上getter/setter
    private Major major;
 
    public Major getMajor(){
	   return major;
    }
   
    public void setMajor(Major major){
	   this.major = major;
    }
    //////////////////////////////////
    
    //添加无参和带参构造
    public Student(){}
    
    public Student(Integer id,String name,String gender,String email,Integer mid){
    	this.stuId = id;
    	this.stuName = name;
    	this.gender = gender;
    	this.email = email;
    	this.mId = mid;
    }
    
    public Student(String name,String gender,String email,Integer mid){
    	this.stuName = name;
    	this.gender = gender;
    	this.email = email;
    	this.mId = mid;
    }
    ////////////
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }
}