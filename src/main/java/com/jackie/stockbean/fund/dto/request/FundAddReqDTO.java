package com.jackie.stockbean.fund.dto.request;

import com.jackie.stockbean.fund.vo.DistributeVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author xujj
 * @date 2021/4/7
 */
@Data
@ApiModel(value="基金添加参数",description="基金添加参数")
public class FundAddReqDTO implements Serializable {
    @ApiModelProperty(value="基金代码", name="code", required = true)
    private String code;
    @ApiModelProperty(value="基金名称", name="name", required = true)
    private String name;
    @ApiModelProperty(value="基金投资占比", name="distributeList", required = true)
    private List<DistributeVo> distributeList;
    @ApiModelProperty(value="基金股票投资占比", name="stockDistributeList", required = true)
    private List<DistributeVo> stockDistributeList;
}
