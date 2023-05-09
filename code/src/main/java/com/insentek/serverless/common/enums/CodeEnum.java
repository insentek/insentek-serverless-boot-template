package com.insentek.serverless.common.enums;

public enum CodeEnum {
    SUCCESS(200, "ok"),
    INVALID_REQUEST(400, "INVALID REQUEST"),
    UNAUTHORIZED(401, "Unauthorized"),
    FOR_BIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "NOT FOUND"),
    SERVER_FAIL(500, "INTERNAL SERVER ERROR");
    public final int code;
    public final String msg;

    public Integer getCode() {
        return this.code;
    }

    CodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }
}
