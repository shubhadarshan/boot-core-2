package in.spdev.config;

import in.spdev.beans.Launcher;
import in.spdev.beans.Rocket;
import org.springframework.context.annotation.Bean;

public class ChildComponentConfiguration {
    @Bean
    public Rocket rocket(Launcher launcher){
        Rocket rocket = new Rocket();
        rocket.setLauncher(launcher);
        return rocket;
    }
}
