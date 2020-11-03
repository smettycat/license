package com.appleyk.core.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AppVerify implements Serializable {

    private Long id;

    private Integer appType;

    private String ipAddr;

    private String macAddr;

    private Date beginTime;

    private Date endTime;
}
