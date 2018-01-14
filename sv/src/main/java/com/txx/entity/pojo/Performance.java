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
    private int chinese;
    private int math;
    private int english;
    private int politics;
    private  int history;
    private int geography;
    private int physics;
    private int chemistry;
    private int biology;
    private int reserved1;//预留科目1
    private int reserved2;//预留科目2
    private int reserved3;//预留科目3
    private int reserved4;//预留科目4
    private int reserved5;//预留科目5
    private int reserved6;//预留科目6
    private Long examId;//哪次考试

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
