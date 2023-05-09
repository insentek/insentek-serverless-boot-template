package com.insentek.serverless.common.exception;

import java.io.Serial;

/**
 * 业务异常
 *
 * @author hao.ding@insentek.com
 * @date 2022-04-13 17:12
 */
public class BusinessException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 6610083281801529147L;

    /**
     * 错误码
     */
    private Integer code;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
