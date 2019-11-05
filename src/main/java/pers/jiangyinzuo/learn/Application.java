package pers.jiangyinzuo.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication: 标注主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        // 启动Spring Boot
        SpringApplication.run(Application.class, args);
    }
}
