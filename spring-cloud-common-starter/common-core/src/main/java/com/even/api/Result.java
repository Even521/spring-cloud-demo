package com.even.api;

import com.even.constant.CommonConstants;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
 *
 * @author even
 * @date 2019/4/25 14:35
 * @describe 结果封装类
 */

@Accessors(chain = true)
@Data
@Builder
public class Result<T> implements Serializable {
    /**
     * code
     */
    private int code ;
    /**
     * 消息
     */
    private String msg ;
    /**
     * 返回数据
     */
    private T data;


}
