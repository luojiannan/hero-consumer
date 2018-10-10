package com.hero.feign;

import com.hero.common.BaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ljn
 * @date 2018/10/10.
 */
@FeignClient("dragonBall")
public interface IUserFeignClient {

    /**
     * 巴拉巴拉
     * @param id
     * @return
     * 这里的注解不能使用GetMapping
     */
    @RequestMapping(value = "user/findById" , method = RequestMethod.GET)
    public BaseResponse findById(@RequestParam("id")Long id);
}
