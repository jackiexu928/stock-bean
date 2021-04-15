package com.jackie.stockbean.fund.commom;

/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author xujj
 * @date 2021/4/13
 */
public enum DistributeEnum {
    STOCK("股票"),
    DEPOSIT("银行存款"),
    OTHER("其他")
    ;
    private String name;

    public String getName() {
        return name;
    }

    DistributeEnum(String name) {
        this.name = name;
    }
}
