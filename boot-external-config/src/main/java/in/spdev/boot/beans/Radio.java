package in.spdev.boot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Radio {
    @Autowired
    private Tunner tunner;
    @Value("${radio.radioType}")
    private String radioType;
    @Value("${radio.manufacturer}")
    private String manufacturer;
    @Value("${radio.price}")
    private double price;

    @Override
    public String toString() {
        return "Radio{" +
                "tunner=" + tunner +
                ", radioType='" + radioType + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
