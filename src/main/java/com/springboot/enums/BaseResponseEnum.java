package com.springboot.enums;


/**
 * @Description: 响应父接口
 * @Author: chenmingjian
 * @Date: 18-11-5 18:10
 */
public interface BaseResponseEnum {

    /**
     * 状态码
     * @return:
     */
    Integer getCode();

    /**
     * 状态信息
     * @return:
     */
    String getMessage();

    /**
     * 信息详情
     * @return:
     */
    String getDetail();

}
