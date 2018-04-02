package com.demo.controller;

import com.demo.dao.UUserMapper;
import com.demo.entity.UUser;
import com.demo.entity.User;
import com.demo.service.UserService;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@EnableAutoConfiguration
//@RequestMapping("/User")
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private UUserMapper uUserMapper;
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String loginForm(Model model){
        model.addAttribute("user", new User());
        return "login";
    }
    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String salt="("+request.getParameter("username")+")";
        String md5Pwd=new Md5Hash(request.getParameter("password"),salt).toString();
//        String password = request.getParameter("password");
        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(username,md5Pwd);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(usernamePasswordToken);   //完成登录
            UUser uUser=(UUser) subject.getPrincipal();
            request.getSession().setAttribute("uUser", uUser);
            return "Success";
        } catch(Exception e) {
            return "Fail" ;//返回登录页面
        }
    }
    @RequestMapping("/register")
    public String register(HttpServletRequest request, HttpSession session) {
        String username = request.getParameter("username");
        String salt="("+request.getParameter("username")+")";
        String password = request.getParameter("password");
        String md5Pwd=new Md5Hash(password,salt).toString();
        UUser uUser = new UUser();
        uUser.setNickname(username);
        uUser.setPswd(md5Pwd);
        int n = uUserMapper.insert(uUser);
        return n+"";
    }
}
