package com.yd93.jdbc;


/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-25 13:23:36
 **/
public class Student {

    /**
     * 这里的实体类student中的id必须是自增长的，且最好是作为主键，且不要通过任何语句给id赋值，让他自己增长才能不重复
     * 我这里使用的Mysql版本是8.0.14的绿化版
     * */
   private Integer age;
   private String name;
   private Integer id;
   private String gender;
   private String address;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
