package com.demo.simplemodel;

import com.demo.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@EnableAutoConfiguration
@RequestMapping("/Message")
public class MessageSend {
    @RequestMapping("send")
    public void send(HttpServletRequest request) {

    }
}
