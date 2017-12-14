package com.txx.entity.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 帅气的创建
 * <p>成绩表
 * <p>
 * feature;
 */
public class Performance implements Serializable{

    private static final long serialVersionUID = 4712979160670005529L;

    private Integer Id;
    private Long studentId;
    private Integer score;
    private Long classrRank;
    private Long schoolRank;
    private Integer subject;
    private Long examId;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getSubject() {
        return subject;
    }

    public void setSubject(Integer subject) {
        this.subject = subject;
    }

    public Long getClassrRank() {
        return classrRank;
    }

    public void setClassrRank(Long classrRank) {
        this.classrRank = classrRank;
    }

    public Long getSchoolRank() {
        return schoolRank;
    }

    public void setSchoolRank(Long schoolRank) {
        this.schoolRank = schoolRank;
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }
}
