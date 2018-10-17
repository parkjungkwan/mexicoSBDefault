package com.mexico.web;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan(basePackages ={"com.mexico.web"})
//@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
            sessionFactory.setDataSource(dataSource);
            return sessionFactory.getObject();
    }


}
