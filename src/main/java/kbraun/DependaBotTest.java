package kbraun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DependaBotTest {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DependaBotTest.class)
                .run(args);
    }
}
