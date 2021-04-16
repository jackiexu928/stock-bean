package com.jackie.stockbean.investor.dto.response;

import lombok.Data;

/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author xujj
 * @date 2021/4/16
 */
@Data
public class InvestorHoldRespDTO {
    private Long id;
    private String name;
    private Long mobile;
    private String email;
    private String holdFund;
    private String holdStock;
}
