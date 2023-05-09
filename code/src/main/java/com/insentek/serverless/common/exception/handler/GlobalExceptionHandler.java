
package com.insentek.serverless.common.exception.handler;

import com.insentek.serverless.common.enums.CodeEnum;
import com.insentek.serverless.common.exception.BusinessException;
import com.insentek.serverless.common.model.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;


/**
 * 全局异常处理器
 *
 * @author hao.ding@insentek.com
 * @date 2022-04-13 17:10
 */
@Slf4j
@ResponseBody
@RestControllerAdvice
public class GlobalExceptionHandler {


    /**
     * IllegalArgumentException 异常处理返回json
     */
    @ExceptionHandler({IllegalArgumentException.class})
    public R<?> badRequestException(IllegalArgumentException e) {
        return defHandler(e.getMessage(), e);
    }

    /**
     * HttpRequestMethodNotSupportedException 异常处理返回json
     */
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    public R<?> handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        return defHandler(e.getMessage(), e);
    }

    /**
     * Bean 校验异常 Validate
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        String message = e.getBindingResult().getAllErrors().get(0).getDefaultMessage();
        log.error(message, e);
        return R.failed(CodeEnum.INVALID_REQUEST.getCode(), CodeEnum.INVALID_REQUEST.getMsg() + ":" + message);
    }

    /**
     * 方法参数校验异常 Validate
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public R<?> handleValidationException(ConstraintViolationException e) {
        String message = e.getConstraintViolations().iterator().next().getMessage();
        log.error(message, e);
        return R.failed(CodeEnum.INVALID_REQUEST.getCode(), CodeEnum.INVALID_REQUEST.getMsg() + ":" + message);
    }

    /**
     * BusinessException 业务异常处理
     * 返回状态码:500
     */
    @ExceptionHandler(BusinessException.class)
    public R<?> handleBusinessException(BusinessException e) {
        return defHandler(e.getMessage(), e);
    }


    /**
     * 处理所有不可知的异常
     */
    @ExceptionHandler(Exception.class)
    public R<?> handleException(Exception e) {
        return defHandler("unknown exception", e);
    }


    /**
     * 统一返回
     */
    private R<?> defHandler(String msg, Exception e) {
        log.error(msg, e);
        return R.failed(msg);
    }
}
