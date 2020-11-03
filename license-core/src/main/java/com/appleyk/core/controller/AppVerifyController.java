package com.appleyk.core.controller;

import com.appleyk.core.result.ResponseResult;
import com.appleyk.core.service.AServerInfos;
import com.appleyk.core.service.AppVerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/license")
public class AppVerifyController {

    @Autowired
    private AppVerifyService appVerifyService;

    /**
     * 校验ip是否合法
     */
    @RequestMapping(value = "/verify")
    public ResponseResult getServerInfos(String ipAddr) {
        Map<String,Boolean> result = new HashMap<>();
        result.put("valid",appVerifyService.checkIfValid(ipAddr));
        return ResponseResult.ok(result);
    }
}
