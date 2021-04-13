package com.jackie.stockbean.fund.entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA
 * Description:
 *`id` bigint(128) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
 *   `code` varchar(6) NOT NULL COMMENT '基金代码',
 *   `name` varchar(32) NOT NULL COMMENT '基金名称',
 *   `distribute` VARCHAR(256) NOT NULL COMMENT '投资分布',
 *   `stock_distribute` text NOT NULL COMMENT '基金持股',
 * @author xujj
 * @date 2021/4/6
 */
@Data
public class Fund {
    private Long id;
    private String code;
    private String name;
    private String distribute;
    private String stockDistribute;
}
