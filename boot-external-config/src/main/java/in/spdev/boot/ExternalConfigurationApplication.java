package in.spdev.boot;

import in.spdev.boot.beans.Radio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExternalConfigurationApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ExternalConfigurationApplication.class,args);
        Radio beanRadio = context.getBean(Radio.class);
        System.out.println(beanRadio);
    }
}
