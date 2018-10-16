package com.hero.hystrix;

import com.hero.common.BaseResponse;
import com.hero.entity.UserEO;
import com.hero.feign.IUserFeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ljn
 * @date 2018/10/16.
 * 断路器
 */
@Component
public class HystrixClientFallback implements IUserFeignClient {

    @Override
    public BaseResponse findById(@RequestParam("id") Long id) {
        BaseResponse response = new BaseResponse();
        response.setResult("断路");
        return response;
    }

    @Override
    public BaseResponse add(@RequestBody UserEO user) {
        return null;
    }

    @Override
    public BaseResponse getAll(@RequestParam("page") Integer page, @RequestParam("size") Integer size) {
        return null;
    }
}
