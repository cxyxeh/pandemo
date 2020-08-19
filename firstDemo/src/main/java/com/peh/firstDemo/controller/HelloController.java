package com.peh.firstDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author peh
 * @date 2020-08-19
 */
@RequestMapping("hello")
@Controller
public class HelloController {
    @ResponseBody
    @GetMapping("print")
    public void responseWrite(HttpServletResponse httpServletResponse){
        try {
            httpServletResponse.getWriter().print("Welcome Java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
