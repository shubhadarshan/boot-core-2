package in.spdev;

import in.spdev.bean.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class BootConfigurationApplication {
    public static void main(String[] args) {
        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(BootConfigurationApplication.class);
        SpringApplication application = springApplicationBuilder.build(args);
        ConfigurableApplicationContext run = application.run();
        Book book = run.getBean(Book.class);
        System.out.println(book);
        run.close();
    }
}
