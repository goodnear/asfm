package com.txx.entity.dto;

import com.txx.entity.pojo.Exam;
import javafx.scene.chart.XYChart;

import java.io.Serializable;
import java.util.Date;

/**
 * 帅气的创建
 * <p>
 * <p>
 * feature;
 */
public class ExamDto extends Exam implements Serializable {
    private Date startDate;
    private Date endDate;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
