package com.hero.controller;


import com.hero.common.BaseResponse;
import com.hero.entity.UserEO;
import com.hero.feign.IUserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "add")
    public BaseResponse add(@RequestBody UserEO user){
        return userFeignClient.add(user);
    }


}
