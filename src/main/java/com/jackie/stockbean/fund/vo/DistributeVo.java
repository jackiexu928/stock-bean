package com.jackie.stockbean.fund.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author xujj
 * @date 2021/4/6
 */
@Data
@ApiModel(value="占比内容",description="占比内容")
public class DistributeVo {
    @ApiModelProperty(value="代码", name="code")
    private String code;
    @ApiModelProperty(value="名称", name="name", required = true)
    private String name;
    @ApiModelProperty(value="占比", name="proportion", required = true)
    private Double proportion;
}
