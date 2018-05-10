package com.controller;
import com.entity.User;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 〈〉
 *
 * @author Administrator
 * @create 2018/5/10
 * @since 1.0.0
 */
@Controller
public class UserController {
    @Resource(name="userService")
    private UserService userService;
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("/login")
    public String judgeUser(User user,HttpServletRequest request){
        //int id=user.getUserID();
        //HttpSession session = request.getSession();
        //把用户数据保存在session域对象中
        //session.setAttribute("id", id);
        if(userService.login(user)){
            request.setAttribute("user", user);
            return "/success";
        }
        else{
            request.setAttribute("info","登录失败！");
            return "/fail";
        }
    }

}