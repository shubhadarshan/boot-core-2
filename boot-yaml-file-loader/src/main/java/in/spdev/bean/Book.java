package in.spdev.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@NoArgsConstructor
@ToString
@ConfigurationProperties(prefix = "book")
@Setter
@Getter
public class Book {
    String authorName;
    String publicationHouse;
    String bookName;
    double price;
    List<String> availableCountries;
}
