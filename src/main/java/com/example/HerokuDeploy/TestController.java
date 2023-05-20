package com.example.HerokuDeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String getWord(){
        return "Heroku test";
    }
    @GetMapping("/2")
    public String getWord2(){
        return "Heroku test 2";
    }
}
