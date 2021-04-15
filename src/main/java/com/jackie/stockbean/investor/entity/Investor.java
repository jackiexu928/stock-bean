package com.jackie.stockbean.investor.entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author xujj
 * @date 2021/4/15
 */
@Data
public class Investor {
    private Long id;
    private String name;
    private Long mobile;
    private String email;
}
