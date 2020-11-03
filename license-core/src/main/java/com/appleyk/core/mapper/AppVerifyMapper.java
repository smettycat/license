package com.appleyk.core.mapper;


import com.appleyk.core.entity.AppVerify;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppVerifyMapper {

    AppVerify getByIpAddr(String ipAddr);
}
