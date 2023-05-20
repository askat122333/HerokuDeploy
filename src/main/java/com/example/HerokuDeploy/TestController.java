package com.example.HerokuDeploy;

import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/+/{a}/{b}")
    public Integer sum (@PathVariable int a,@PathVariable int b) {
        return a + b ;
    }
    @PostMapping("/*")
    public Integer mult (@RequestParam int a, @RequestParam int b) {
        return a + b ;
    }
}
