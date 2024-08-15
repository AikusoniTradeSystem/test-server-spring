package io.github.aikusonitradesystem.testserver.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication(scanBasePackages = "io.github.aikusonitradesystem")
@ConfigurationPropertiesScan(basePackages = "io.github.aikusonitradesystem")
public class TestServerSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestServerSpringApplication.class, args);
    }

}
