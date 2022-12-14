package in.spdev.boot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tunner {
    @Value("${tunner.signalType}")
    private String signalType;
    @Value("${tunner.bandwidth}")
    private double bandwidth;

    @Override
    public String toString() {
        return "Tunner{" +
                "signalType='" + signalType + '\'' +
                ", bandwidth=" + bandwidth +
                '}';
    }
}
