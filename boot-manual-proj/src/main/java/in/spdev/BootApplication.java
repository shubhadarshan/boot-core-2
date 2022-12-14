package in.spdev;

import in.spdev.beans.Bike;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BootApplication.class, args);
        Bike bike = context.getBean(Bike.class);
        System.out.println(bike);
        context.close();
    }
}
