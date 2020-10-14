package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Controller;

/**
 * @author Liulei
 * @create 2020-10-14 8:49
 */
public class CustomerBlockHandler {
    //自定义的处理方法必须是静态方法
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(200,"客戶自定义,CustomerBlockHandler……1",new Payment(2020L,"serial003"));
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(200,"客戶自定义,CustomerBlockHandler……2",new Payment(2020L,"serial003"));
    }
}
