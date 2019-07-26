package com.fh.shop.classify;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fh.shop.classify.mapper")
public class ShopClassifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopClassifyApplication.class, args);
    }

}
