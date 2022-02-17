package com.taki.inventory;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @ClassName InventoryApplication
 * @Description 商品库存服务 入口
 * @Author Long
 * @Date 2022/2/17 10:10
 * @Version 1.0
 */
@SpringBootApplication
public class InventoryApplication {
    public static void main(String[] args) {
       new SpringApplicationBuilder().bannerMode(Banner.Mode.OFF).sources(InventoryApplication.class).run(args);
    }

}
