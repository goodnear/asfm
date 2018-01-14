package com.txx.controller;

import com.txx.dao.UserDao;
import com.txx.entity.common.Constant;
import com.txx.entity.common.ResponseData;
import com.txx.entity.dto.UserDto;
import com.txx.entity.pojo.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.net.HttpCookie;
import java.util.Map;

/**
 * 帅气的创建
 * <p>
 * <p>
 * feature;
 */
@Controller
@RequestMapping("login")
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "login.html")
    public String login(){
        return "sys/login";
    }

    @RequestMapping(value = "doLogin.do",method = RequestMethod.POST)
    @ResponseBody
    public ResponseData login(@RequestBody(required = false) UserDto userDto, HttpServletRequest request){
        ResponseData responseData = new ResponseData();
        String result = checkUser(userDto);
        if (!result.equals(Constant.OK)){
            responseData.setCode(Constant.PARAMETE_RERROR);
            responseData.setInfo(result);
            return responseData;
        }
        User user = userDao.findUser(userDto);
        if(user == null){
            responseData.setCode(Constant.fail);
            responseData.setInfo("账号或密码不正确");
            return responseData;
        }
        responseData.setCode(Constant.SUCCESS);
        responseData.setInfo("登录成功");

        request.getSession().setAttribute("user",user);
        return responseData;
    }

    private String checkUser(User user){

        if (StringUtils.isEmpty(user.getLoginName())){
            return "登录名不能为空！";
        }
        if (StringUtils.isEmpty(user.getPassword())){
            return "密码不能为空";
        }
        return Constant.OK;
    }

}
