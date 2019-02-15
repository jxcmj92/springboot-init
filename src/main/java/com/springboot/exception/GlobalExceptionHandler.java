package com.springboot.exception;

import com.springboot.entry.pojo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 全局的异常处理
 * @Author: chenmingjian
 * @Date: 18-10-31 19:00
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

//    @ExceptionHandler
//    @ResponseBody
//    public ResponseEntity defaultErrorHandler(HttpServletRequest req, Exception e){
//        log.error(e.getMessage(), e);
//        return ResponseEntity.ok(Response.fail(FailStatus.SYSTEM_ERROR));
//    }


    /**
     * 参数校验统一异常处理
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseEntity handleBindException(MethodArgumentNotValidException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        log.warn("参数校验异常:{}({})", fieldError.getDefaultMessage(),fieldError.getField());
        return ResponseEntity.ok(Response.fail(211,fieldError.getDefaultMessage(),fieldError.getDefaultMessage()));
    }




    /**
     * 自定义异常处理
     */
//    @ExceptionHandler(MyException.class)
//    @ResponseBody
//    public ResponseEntity myException(MyException e) {
//        return ResponseEntity.ok(Response.fail(e.getCode(),e.getMessage(),e.getDetail()));
//    }

}
