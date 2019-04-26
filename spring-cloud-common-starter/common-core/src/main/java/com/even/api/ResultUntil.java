package com.even.api;

import com.even.constant.CommonConstants;
import com.even.eum.ExceptionEnum;

/**
 * @author even
 * @date 2019/4/25 15:11
 * @describe
 */
public class ResultUntil {
    /**
     * 构造方法
     * @param object
     * @param code
     * @param message
     * @return
     */
    private static Result resultBuilder(Object object,int code,String message){
        return Result.builder()
                .data(object)
                .code(code)
                .msg(message).build();
    }

    /**
     * 请求成功，返回数据
     * @param object
     * @return
     */
    public static Result success(Object object){
        return resultBuilder(object, CommonConstants.SUCCESS,CommonConstants.SUCCESS_MESSAGE);
    }
    /**
     * 请求成功，返回数据
     * @param object
     * @return
     */
    public static Result success(Object object,String msg){
        return resultBuilder(object,CommonConstants.SUCCESS,msg);
    }

    /**
     * 请求成功
     * @return
     */
    public static Result success(){
        return resultBuilder(null,CommonConstants.SUCCESS,CommonConstants.SUCCESS_MESSAGE);
    }

    /**
     * 请求失败
     * @param code
     * @param msg
     * @return
     */
    public  static Result fail(int code,String msg){
        return resultBuilder(CommonConstants.FAIL,code,msg);
    }
    /**
     * 请求失败
     * @param msg
     * @return
     */
    public  static Result fail(String msg){
        return resultBuilder(CommonConstants.STR_EMPTY,CommonConstants.FAIL,msg);
    }

    /**
     * 自定义错误枚举类
     * @param exceptionEnum
     * @return
     */
    public static Result fail(ExceptionEnum exceptionEnum){
        return resultBuilder(CommonConstants.STR_EMPTY,exceptionEnum.getCode(),exceptionEnum.getMsg());
    }


    /**
     * 操作
     * @param res
     * @param <T>
     * @return
     */
    public static  <T> Result<T> operation(int res) {
        return res>0?success():fail(CommonConstants.FAIL,CommonConstants.FAIL_MESSAGE);
    }

    /**
     * 操作
     * @param res
     * @param <T>
     * @return
     */
    public static <T> Result<T>  operation(boolean res){
        return res==true?success():fail(CommonConstants.FAIL,CommonConstants.FAIL_MESSAGE);
    }

}
