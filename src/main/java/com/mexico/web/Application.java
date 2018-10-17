package com.mexico.web;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mexico.web.mapper.MemberMapper;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {
	@Autowired MemberMapper mapper;
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}