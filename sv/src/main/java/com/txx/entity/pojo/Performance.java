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
    private String studentName;
    private Integer totalScore;
    private Long classRank;
    private Long schoolRank;
    private Long examId;//哪次考试
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

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
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

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getPolitics() {
        return politics;
    }

    public void setPolitics(int politics) {
        this.politics = politics;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getGeography() {
        return geography;
    }

    public void setGeography(int geography) {
        this.geography = geography;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getBiology() {
        return biology;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }

    public int getReserved1() {
        return reserved1;
    }

    public void setReserved1(int reserved1) {
        this.reserved1 = reserved1;
    }

    public int getReserved2() {
        return reserved2;
    }

    public void setReserved2(int reserved2) {
        this.reserved2 = reserved2;
    }

    public int getReserved3() {
        return reserved3;
    }

    public void setReserved3(int reserved3) {
        this.reserved3 = reserved3;
    }

    public int getReserved4() {
        return reserved4;
    }

    public void setReserved4(int reserved4) {
        this.reserved4 = reserved4;
    }

    public int getReserved5() {
        return reserved5;
    }

    public void setReserved5(int reserved5) {
        this.reserved5 = reserved5;
    }

    public int getReserved6() {
        return reserved6;
    }

    public void setReserved6(int reserved6) {
        this.reserved6 = reserved6;
    }

    public Long getClassRank() {
        return classRank;
    }

    public void setClassRank(Long classRank) {
        this.classRank = classRank;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
