package com.appleyk.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <p>SpringBoot启动类</p>
 *
 * @author appleyk
 * @version V.0.2.1
 * @blob https://blog.csdn.net/appleyk
 * @date created on 10:24 下午 2020/8/21
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.appleyk.core.mapper")
public class LicenseApp extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(LicenseApp.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(LicenseApp.class);
    }
}
