package com.bee.sample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
public class Ch1Application{
    public static void main(String [] args){
        SpringApplication.run(Ch1Application.class,args);
    }

}
