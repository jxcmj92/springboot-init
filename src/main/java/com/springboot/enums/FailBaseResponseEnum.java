package com.springboot.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @description: 响应失败枚举
 * @author: chenmingjian
 * @date: 19-2-1 14:17
 */
@NoArgsConstructor
@AllArgsConstructor
public enum FailBaseResponseEnum implements BaseResponseEnum{

    //

    //1000 - 2000 表示与登录失败相关的code
    LOGIN_FAIL(1000,"登录失败","登录失败")



    ;

    private Integer code;

    private String message;

    private String detail;

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getDetail() {
        return detail;
    }
}
