package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yeyu on 2018/12/16.
 * 描述：
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/getdemo")
    public String getDemo(){
        return "HEllo Word";
    }
}
