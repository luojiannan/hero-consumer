package com.hero.feign;

import com.hero.common.BaseResponse;
import com.hero.entity.UserEO;
import com.hero.hystrix.HystrixClientFallback;
import com.hero.hystrix.HystrixConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ljn
 * @date 2018/10/10.
 */
@FeignClient(name = "dragonBall", configuration = HystrixConfig.class, fallback = HystrixClientFallback.class)
public interface IUserFeignClient {

    /**
     * 巴拉巴拉
     * @param id
     * @return
     * 这里的注解不能使用GetMapping
     */
    @RequestMapping(value = "user/findById" , method = RequestMethod.GET)
    BaseResponse findById(@RequestParam("id")Long id);

    /**
     * add
     * @param user
     * @return
     */
    @RequestMapping(value = "user/add" , method = RequestMethod.POST)
    BaseResponse add(@RequestBody UserEO user);

    @RequestMapping(value="user/getUserList",method = RequestMethod.GET)
    BaseResponse getAll(@RequestParam("page") Integer page,@RequestParam("size") Integer size);
}
