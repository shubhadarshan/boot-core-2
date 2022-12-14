package in.spdev.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FuelTank {
    @Value("${fuelType}")
    private String fuelType;
    @Value("${capacity}")
    private String capacity;

    @Override
    public String toString() {
        return "FuelTank{" +
                "fuelType='" + fuelType + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
