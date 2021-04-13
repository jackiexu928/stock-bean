package com.jackie.stockbean.fund.dto.request;

import com.jackie.stockbean.fund.vo.DistributeVo;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author xujj
 * @date 2021/4/7
 */
@Data
public class FundAddReqDTO {
    private String code;
    private String name;
    private List<DistributeVo> distributeList;
    private List<DistributeVo> stockDistributeList;
}
