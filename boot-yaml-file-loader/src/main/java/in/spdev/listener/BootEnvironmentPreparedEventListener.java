package in.spdev.listener;

import lombok.SneakyThrows;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.FileSystemResource;

import java.util.List;

/**
 * Loading yaml file when ApplicationEnvironmentPreparedEvent is triggered
 * (Just after creating Environment object)
 * */


public class BootEnvironmentPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    @SneakyThrows
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {

        YamlPropertySourceLoader yamlPropertySourceLoader = new YamlPropertySourceLoader();
        List<PropertySource<?>> propertySources = yamlPropertySourceLoader.load("global-config", new FileSystemResource("src/main/resources/app-global.yml"));

        ConfigurableEnvironment environment = event.getEnvironment();
        for (PropertySource<?> propertySource: propertySources) {
            environment.getPropertySources().addLast(propertySource);
        }
    }
}
