package com.uniteddata.mongoexample.bean;

import lombok.Data;

/**
 * @ClassName ResponseResult
 * @Description TODO 前后端交互响应结果集Bean
 * @Author dong <feng.db@uniteddata.com>
 * @Date 2019/8/6
 * @Version 1.0.0
 **/
@Data
public class ResponseResult<T> {
    private String msg;
    private int code;
    private T data;
}
