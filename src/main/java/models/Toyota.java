package Cars;

import org.example.Car;

public class Toyota extends Car {
    public Toyota(String model, int year, String transmission, String color, double price) {
        super(model, year, transmission, color, "Toyota", price);
    }
}
