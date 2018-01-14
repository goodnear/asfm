package com.txx.dao;

import com.txx.entity.dto.ExamDto;
import com.txx.entity.vo.ExamVo;

public interface ExamDao {
    void addExam(ExamDto examDto);
    ExamVo getExamByClbumId(ExamDto examDto);
}
