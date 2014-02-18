package com.deyang.share.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-10-18
 * Time: 下午1:51
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HomeController {

    @RequestMapping({"/","/index"})
    public String showIndexPage(Map<String,Object> model){
        model.put("info","Welcome");
        return "common/index";
    }
}
