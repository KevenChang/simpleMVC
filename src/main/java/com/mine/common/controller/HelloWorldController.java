package com.mine.common.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
                                                 HttpServletResponse response) throws Exception {

        ModelAndView model = new ModelAndView("HelloWorldPage");
        model.addObject("welcome", "hi,welcome to catch this example.");
        model.addObject("msg", "and Must be HELLO WORLD!");
//        model.setViewName("HelloWorldPage");  //这里的view是对应WEB-INF/pages/下的jsp文件名，但不包含jsp

        return model;
    }

}