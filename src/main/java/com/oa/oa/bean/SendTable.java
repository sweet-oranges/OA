package com.oa.oa.bean;

import lombok.Data;

/**
 * 发文审批表
 *
 * @Author zxl on 2019/10/16
 */
@Data
public class SendTable {

    private String id;
    private String title;
    private String content;
    private String sendNumber;
    private Integer secretLevel;

}