package com.fs.config.response;

/**
 * Created by fengsong on 2017/3/9.
 */
public class ResponseUtil {

    private static BaseResponse baseResponse=new BaseResponse();

    public static BaseResponse successful(){
        return baseResponse.successful();
    }
}
