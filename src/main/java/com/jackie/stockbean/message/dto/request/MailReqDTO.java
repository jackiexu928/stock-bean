package com.jackie.stockbean.message.dto.request;

import lombok.Data;

/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author xujj
 * @date 2021/4/7
 */
@Data
public class MailReqDTO {
    private String to;
    private String subject;
    private String content;
}
