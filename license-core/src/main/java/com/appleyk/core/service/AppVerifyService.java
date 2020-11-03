package com.appleyk.core.service;

import com.appleyk.core.entity.AppVerify;
import com.appleyk.core.mapper.AppVerifyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AppVerifyService {

    @Autowired
    private AppVerifyMapper appVerifyMapper;

    public Boolean checkIfValid(String ipAddr){
        AppVerify appVerify = appVerifyMapper.getByIpAddr(ipAddr);
        if(appVerify == null){
            return false;
        }
        Date now = new Date();
        return appVerify.getEndTime().after(now);
    }
}
