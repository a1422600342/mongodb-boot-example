package com.uniteddata.mongoexample.util;

import com.uniteddata.mongoexample.bean.ResponseResult;
import com.uniteddata.mongoexample.bean.ResponseResultWithCount;
import com.uniteddata.mongoexample.bean.ResponseStatus;

/**
 * @ClassName ResultGeneratorUtil
 * @Description TODO 结果集生成器工具
 * @Author dong <feng.db@uniteddata.com>
 * @Date 2019/8/6
 * @Version 1.0.0
 **/
public class ResultGeneratorUtil {

    public static ResponseResult getResultSuccess(){
        ResponseResult result = new ResponseResult();
        result.setCode(ResponseStatus.SUCCESS.getCode());
        result.setMsg(ResponseStatus.SUCCESS.getMsg());
        return result;
    }

    public static ResponseResult getResultFail(){
        ResponseResult result = new ResponseResult();
        result.setCode(ResponseStatus.FAIL.getCode());
        result.setMsg(ResponseStatus.FAIL.getMsg());
        return result;
    }

    public static ResponseResult getResultFail(Object msg) {
        ResponseResult result = new ResponseResult();
        result.setCode(ResponseStatus.FAIL.getCode());
        result.setMsg(ResponseStatus.FAIL.getMsg());
        result.setData(msg);
        return result;
    }

    public static ResponseResult getResultSuccessWithData(Object data){
        ResponseResult result = new ResponseResult();
        result.setCode(ResponseStatus.SUCCESS.getCode());
        result.setMsg(ResponseStatus.SUCCESS.getMsg());
        result.setData(data);
        return result;
    }

    public static ResponseResult getResultSuccessWithCount(Object data, long count) {
        ResponseResultWithCount result = new ResponseResultWithCount();
        result.setCode(ResponseStatus.SUCCESS.getCode());
        result.setMsg(ResponseStatus.SUCCESS.getMsg());
        result.setData(data);
        result.setCount(count);
        return result;
    }

}
