package com.txx.entity.pojo;

import javax.sql.DataSource;
import java.util.Date;

/**
 * 帅气的创建
 * <p>
 * <p>
 * feature;
 */
public class UploadFileInfo {
    private Long id;
    private String fileName;
    private Long userId;
    private Date uploadDate;
    private String path;
    private Long clbumId;
    private Long examId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getClbumId() {
        return clbumId;
    }

    public void setClbumId(Long clbumId) {
        this.clbumId = clbumId;
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }
}
