package cn.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("cn.mybatis.mapper")
@SpringBootApplication
@EnableTransactionManagement
public class SpringBootMybatis001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatis001Application.class, args);
    }

}
