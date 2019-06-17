package com.sgm.community.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



/**
 * @author wxg
 * @creat 2019-06-14-16:03
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public  String Index(){
        return "index";
    }
}
