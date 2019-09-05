package com.uniteddata.mongoexample.bean;

/**
 * @ClassName ResponseStatus
 * @Description TODO 前后端交互状态码规范
 * @Author dong <feng.db@uniteddata.com>
 * @Date 2019/8/7
 * @Version 1.0.0
 **/
public enum ResponseStatus {

    SUCCESS(0, "SUCCESS"),
    FAIL(-1, "FAIL");

    private final Integer code;
    private final String msg;
    private ResponseStatus(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
    public Integer getCode(){
        return code;
    }
    public String getMsg(){
        return msg;
    }
    @Override
    public String toString() {
        return "{code:" + code + ",msg:" + msg + "}";
    }
}
