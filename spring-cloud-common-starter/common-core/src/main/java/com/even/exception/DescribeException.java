package com.even.exception;

import com.even.eum.ExceptionEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author even
 * @date 2019/4/25 15:41
 * @describe
 */
@NoArgsConstructor
public class DescribeException extends RuntimeException {
    @Setter
    @Getter
    private int code;

    public DescribeException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = exceptionEnum.getCode();
    }
    public DescribeException(Integer code,String message) {
        super(message);
        this.code = code;
    }
}
