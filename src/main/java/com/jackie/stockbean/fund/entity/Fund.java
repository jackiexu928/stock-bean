package com.jackie.stockbean.fund.entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA
 * Description:
 *
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
