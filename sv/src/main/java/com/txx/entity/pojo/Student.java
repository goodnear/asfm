package com.txx.entity.pojo;

import java.io.Serializable;

/**
 * 帅气的创建
 * <p>
 * <p>
 * feature;
 */
public class Student implements Serializable{

    private static final long serialVersionUID = 1198042996613604651L;

    private Long id;
    private String name;
    private Integer age;
    private Integer sex;
    private Long clbumId;//所属班级
    private Integer level;//学生成绩级别

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Long getClbumId() {
        return clbumId;
    }

    public void setClbumId(Long clbumId) {
        this.clbumId = clbumId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
