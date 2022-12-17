package in.spdev;

import in.spdev.bean.Book;
import in.spdev.initializer.YamlConfigApplicationContextInitializer;
import in.spdev.listener.BootEnvironmentPreparedEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExternalYamlLoadingBootApp {
    public static void main(String[] args) {

        // SpringApplication springApplication = new SpringApplicationBuilder(ExternalYamlLoadingBootApp.class).initializers(new YamlConfigApplicationContextInitializer()).build();

        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(ExternalYamlLoadingBootApp.class);
        SpringApplication springApplication = springApplicationBuilder.listeners(new BootEnvironmentPreparedEventListener()).build();

        ConfigurableApplicationContext context = springApplication.run(args);
        System.out.println(context.getEnvironment());

        System.out.println();

        Book book = context.getBean(Book.class);
        System.out.println(book);
    }
}
