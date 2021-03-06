package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }
    /*@RequestMapping("/item-add")
    public String addItem(){

        return "item-add";
    }*/
    // 页面跳转
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
