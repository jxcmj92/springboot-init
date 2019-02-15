package com.springboot.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: 调用微信接口
 * @Author: chenmingjian
 * @Date: 18-10-30 16:09
 */
@FeignClient(name = "weChatFeign", url = "${feign.api.url}")
public interface WeChatFeign {

    /**
     * 测试
     * @return
     */
    @GetMapping("/test/")
    public String test();
}
