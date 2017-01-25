package org.ycz;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
 * MapperScan：Mybatis扫描该包下的DAO类.
 * SpringBootApplication:该注解包含了@EnableAutoConfiguration,@ComponentScan。
 * @Configuration:等价于之前xml中的beans,可以通过JAVA代码生成一个beans
 * @EnableAutoConfiguration:这个注释告诉Spring Boot基于pom.xml中你添加的jar依赖猜测你将如何配置Spring。
 * 							由于spring-boot-starter-web添加了Tomcat和Spring MVC，
 * 							因此自动配置将假设您正在开发一个Web应用程序并相应地设置Spring。
 * @ComponentScan:自动扫描所有包中的bean，并在实例化后存在ApplicationContext中。
 */
@MapperScan("org.ycz.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationMain {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationMain.class, args);
    }

}
