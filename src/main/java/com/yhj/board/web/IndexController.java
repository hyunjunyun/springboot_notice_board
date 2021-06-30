package com.yhj.board.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

    @RequestMapping("/name")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("name");
        return mav;
    }
}
