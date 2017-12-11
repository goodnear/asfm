package com.txx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 帅气的创建
 * <p>
 * <p>
 * feature;
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("first")
    public String first(){
        return "first";
    }
}
