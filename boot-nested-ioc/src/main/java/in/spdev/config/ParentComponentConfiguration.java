package in.spdev.config;

import in.spdev.beans.Launcher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParentComponentConfiguration {

    @Bean
    public Launcher launcher(@Value("${launcher.location}") String location) {
        return new Launcher(location);
    }
}
