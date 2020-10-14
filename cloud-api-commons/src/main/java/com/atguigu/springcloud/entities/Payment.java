package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Liulei
 * @create 2020-10-06 15:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@ToString
public class Payment implements Serializable {
    private static final long serialVersionUID = -343617459317300831L;
    private Long id;
    private String serial;
}
