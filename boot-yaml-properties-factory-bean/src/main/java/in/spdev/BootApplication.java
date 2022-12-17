package in.spdev;

import in.spdev.bean.Passport;
import in.spdev.ymlfactory.YamlPropertySourceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(name = "app-global", value = "classpath:app-global.yaml", factory = YamlPropertySourceFactory.class)
public class BootApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(BootApplication.class);
        Passport passport = configurableApplicationContext.getBean(Passport.class);
        System.out.println(passport);
    }
}
