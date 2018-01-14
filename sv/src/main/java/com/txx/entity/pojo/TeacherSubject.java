package com.txx.entity.pojo;

/**
 * 帅气的创建
 * <p>
 * <p>l老师科目表
 * feature;
 */
public class TeacherSubject {
    private Long id;
    private Long userId;
    private Long Clbum;
    private int subject;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getClbum() {
        return Clbum;
    }

    public void setClbum(Long clbum) {
        Clbum = clbum;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }
}
