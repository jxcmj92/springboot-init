package com.springboot.entry.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: chenmingjian
 * @date: 19-1-4 14:49
 */
@Data
@AllArgsConstructor
public class Response<T> implements Serializable {

    private static final int SUCCESS_CODE = 200;

    private static final String SUCCESS_MESSAGE = "请求成功";

    private int code;

    private String message;

    private String detail;

    private T data;

    private Response(int code, String message, String detail) {
        this.code = code;
        this.message = message;
        this.detail = detail;
    }



//    public static Response fail(FailStatus failStatus){
//        return new Response(failStatus.getCode(),failStatus.getMessage(),failStatus.getDetail());
//    }

    public static Response fail(int code,String message,String detail){
        return new Response(code,message,detail);
    }

    public static Response success(){
        return new Response(SUCCESS_CODE,SUCCESS_MESSAGE,SUCCESS_MESSAGE);
    }

    public static<E> Response<E> successAndReturn(E e){
        return new Response<>(SUCCESS_CODE,SUCCESS_MESSAGE,SUCCESS_MESSAGE, e);
    }

}
