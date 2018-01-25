package com.txx.base;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 帅气的创建
 * <p>
 * <p>
 * feature;
 */
public class BaseController {

    private int page = 0;
    private int rows = 10;

    @ModelAttribute
    public void setDefaultValue(HttpServletRequest request, HttpServletResponse response){
        String pageStr = request.getParameter("page");
        String rowsStr = request.getParameter("rows");

        if (StringUtils.isNotEmpty(pageStr)) page = Integer.valueOf(pageStr);
        if (StringUtils.isNotEmpty(rowsStr)) rows = Integer.valueOf(rowsStr);
    }

    public int getPage() {
        return page;
    }

    public int getRows() {
        return rows;
    }

}
