package com.wangwei.wiki;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component("com.wangwei.wiki")
@MapperScan("com.wangwei.wiki.mapper")
public class WikiApplication {
    private static final Logger log = LoggerFactory.getLogger(WikiApplication.class);
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("启动成功！！");
        log.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
