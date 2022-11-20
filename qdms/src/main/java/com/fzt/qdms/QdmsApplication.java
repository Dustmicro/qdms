package com.fzt.qdms;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@MapperScan(value = "com.fzt.qdms.mapper")
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class QdmsApplication {
    private static final Logger logger = LoggerFactory.getLogger(QdmsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(QdmsApplication.class, args);
        logger.info("启动成功！！");
    }

}
