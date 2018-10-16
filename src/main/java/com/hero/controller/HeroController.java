package com.hero.controller;


import com.hero.common.BaseResponse;
import com.hero.entity.UserEO;
import com.hero.feign.IUserFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ljn
 * @date 2018/10/9.
 */
@RestController
@RequestMapping("hero")
//@SessionScope
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

    /**
     * 原生断路器配置
     * 如果好几次请求都是断路，那么后续请求会直接走断路
     * @param page
     * @param size
     * @return
     */
    @GetMapping("getAll")
    @HystrixCommand(fallbackMethod = "getAllFallBack")
    public BaseResponse getAll(Integer page, Integer size){
        return userFeignClient.getAll(page,size);
    }

    public BaseResponse getAllFallBack(Integer page, Integer size){
        BaseResponse<Object> response = new BaseResponse<>();
        response.setResult("断路");
        return response;
    }




}
