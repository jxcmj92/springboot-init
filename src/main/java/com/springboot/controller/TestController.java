package com.springboot.controller;

import com.springboot.entry.dto.TestDto;
import com.springboot.feign.WeChatFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * @description:
 * @author: chenmingjian
 * @date: 19-2-1 10:40
 */
@RestController
@RequestMapping("/test")
@Validated
public class TestController {

    @Autowired
    private WeChatFeign weChatFeign;

    @GetMapping("/")
    public String test(){
        return "springboot-init success...";
    }

    /**
     * 利于feign调用外部接口测试，该接口用本地接口模拟外部接口进行测试
     */
    @GetMapping(value = "/feign")
    public String testFeign(){
        return weChatFeign.test();
    }

    /**
     * 测试校验框架返回结果格式
     */
    @PostMapping(value = "/validator")
    public String testValidator(@RequestBody @Valid TestDto testDto){
        return "校验成功...";
    }

    /**
     * 测试校验框架返回结果格式
     */
    @GetMapping(value = "/validator2")
    public String testValidator2(@NotBlank(message = "姓名不能为空") String name){
        return "校验成功...";
    }

}
