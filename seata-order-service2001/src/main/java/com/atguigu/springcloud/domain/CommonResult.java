package com.atguigu.springcloud.domain;

/**
 * @author Liulei
 * @create 2020-10-14 16:31
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;


    public CommonResult(Integer code, String message) {

        this(code, message, null);

    }

}