package com.txx.entity.pojo;

import java.io.Serializable;

/**
 * 帅气的创建
 * <p>班级类
 * <p>
 * feature;
 */
public class Clbum implements Serializable {

    private static final long serialVersionUID = -3242016195295543471L;

    private Long id;
    private String name;//班级名称
    private Integer grade;//年级
    private Integer txxclass;//班级
    private Integer year;//年份
    private Integer studentNum;//班级人数

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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getTxxclass() {
        return txxclass;
    }

    public void setTxxclass(Integer txxclass) {
        this.txxclass = txxclass;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }
}
