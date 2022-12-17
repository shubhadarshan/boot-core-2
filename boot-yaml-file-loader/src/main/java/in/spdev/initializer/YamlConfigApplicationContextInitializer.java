package in.spdev.initializer;

import lombok.SneakyThrows;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

import java.io.IOException;
import java.util.List;

public class YamlConfigApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment env = null;
        List<PropertySource<?>> propertySources = null;
        YamlPropertySourceLoader yamlPropertySourceLoader = null;

        try {
            yamlPropertySourceLoader = new YamlPropertySourceLoader();

            propertySources = yamlPropertySourceLoader.load("config",
                    applicationContext.getResource("classpath:app-global.yml"));


            env = applicationContext.getEnvironment();
            for (PropertySource<?> propertySource : propertySources) {
                env.getPropertySources().addLast(propertySource);
            }

        } catch (IOException e) {
            throw new RuntimeException("failed loading yaml", e);
        }
    }
}
