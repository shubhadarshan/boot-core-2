package in.spdev;

import in.spdev.beans.Rocket;
import in.spdev.config.ChildComponentConfiguration;
import in.spdev.config.ParentComponentConfiguration;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * Nested-IOC*/

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(Application.class);
        springApplicationBuilder = springApplicationBuilder.parent(ParentComponentConfiguration.class).child(ChildComponentConfiguration.class);
        springApplicationBuilder.bannerMode(Banner.Mode.OFF);

        SpringApplication springApplication =springApplicationBuilder.build(args);
        ConfigurableApplicationContext context = springApplication.run();
        Rocket rocket = context.getBean(Rocket.class);
        System.out.println(rocket);
        context.close();
    }
}
