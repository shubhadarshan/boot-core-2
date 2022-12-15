package in.spdev.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Publication {
    @Value("${publicationHouse: Mrs Funny Bone}")
    private String publicationHouse;

    @Override
    public String toString() {
        return "Publication{" +
                "publicationHouse='" + publicationHouse + '\'' +
                '}';
    }
}
