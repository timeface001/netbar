package com.fs.config.response;

import java.io.Serializable;

/**
 * 返回对象
 * Created by fengsong on 2017/3/9.
 */
public class BaseResponse<T> implements Serializable{
    private String code;
    private T data;
    private String msg;



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BaseResponse successful(){
        this.code="000000";
        this.msg="操作成功";
        return this;
    }

}
