package com.txx.entity.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 帅气的创建
 * <p>
 * <p>考试信息表
 * feature;
 */
public class Exam implements Serializable{

    private static final long serialVersionUID = -3472028699094699002L;

    private Long id;
    private String name;
    private Long clbumId;//考试所属班级
    private Date time;
    private Integer important;

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

    public Long getClbumId() {
        return clbumId;
    }

    public void setClbumId(Long clbumId) {
        this.clbumId = clbumId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getImportant() {
        return important;
    }

    public void setImportant(Integer important) {
        this.important = important;
    }
}
