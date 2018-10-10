package com.hero.controller;


import com.hero.common.BaseResponse;
import com.hero.feign.IUserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private IUserFeignClient userFeignClient;


    @GetMapping("queryHero")
    public String queryHero(){
        return "kaluote";
    }

    @GetMapping("findById")
    public BaseResponse findById(Long id){
        return userFeignClient.findById(id);
    }


}
