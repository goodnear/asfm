package com.txx.controller;

import com.txx.base.MyResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.txx.base.BaseController;

/**
 * 帅气的创建
 * <p>
 * <p>
 * feature;
 */
@Controller
@RequestMapping("/performance")
public class PerformanceController extends BaseController{

    @RequestMapping("upload.do")
    @ResponseBody
    public MyResponse<String> upload(){

    }

}
