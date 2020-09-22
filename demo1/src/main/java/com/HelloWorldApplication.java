package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//标注一个主程序 说明这是一个spingboot应用
public class HelloWorldApplication {
    public static void main(String[] args) {
        //应用启动起来
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}
