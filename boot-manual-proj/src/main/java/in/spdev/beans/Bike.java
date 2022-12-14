package in.spdev.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {
    @Autowired
    private FuelTank fuelTank;

    @Override
    public String toString() {
        return "Bike{" +
                "fuelTank=" + fuelTank +
                '}';
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }
}
