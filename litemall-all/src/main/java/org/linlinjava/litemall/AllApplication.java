package org.linlinjava.litemall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "org.linlinjava.litemall",
        "org.linlinjava.litemall.core",
        "org.linlinjava.litemall.db",
        "org.linlinjava.litemall.wx",
        "org.linlinjava.litemall.admin"})
@MapperScan("org.linlinjava.litemall.db.dao")
public class AllApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AllApplication.class, args);
    }

}