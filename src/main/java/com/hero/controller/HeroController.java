package com.hero.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljn
 * @date 2018/10/9.
 */
@RestController
@RequestMapping("hero")
public class HeroController {


    @GetMapping("queryHero")
    public String queryHero(){
        return "kaluote";
    }


}
