package in.spdev;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(Application.class);
        springApplicationBuilder.bannerMode(Banner.Mode.OFF);
        SpringApplication sa = springApplicationBuilder.build(args);
        ConfigurableApplicationContext context = sa.run();
        Uber bean = context.getBean(Uber.class);
        System.out.println(bean);
        context.close();
    }
}
