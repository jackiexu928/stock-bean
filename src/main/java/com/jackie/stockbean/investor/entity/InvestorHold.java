package com.jackie.stockbean.investor.entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author xujj
 * @date 2021/4/16
 */
@Data
public class InvestorHold {
    private Long id;
    private Long investorId;
    private String holdFund;
    private String holdStock;
}
