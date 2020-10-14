package com.atguigu.springcloud.alibaba.service;

/**
 * @author Liulei
 * @create 2020-10-14 16:51
 */
public interface StorageService {

    // 扣减库存
    void decrease(Long productId, Integer count);
}
