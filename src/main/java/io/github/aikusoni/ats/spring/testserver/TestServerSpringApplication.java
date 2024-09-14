package io.github.aikusoni.ats.spring.testserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication(scanBasePackages = "io.github.aikusoni.ats.spring")
@ConfigurationPropertiesScan(basePackages = "io.github.aikusoni.ats.spring")
public class TestServerSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestServerSpringApplication.class, args);
    }

}
