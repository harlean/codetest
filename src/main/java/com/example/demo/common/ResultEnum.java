package com.example.demo.common;

public enum ResultEnum {

    /**
     * 操作成功
     */
    SUCCESS(200, "操作成功");
    /**
     * 返回码
     */
    private final int code;

    /**
     * 返回信息
     */
    private final String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
