package com.atguigu.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @author Liulei
 * @create 2020-10-14 16:49
 */
@Data
public class Storage {

    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;


    //已用库存
    private Integer used;


    //剩余库存
    private Integer residue;
}

