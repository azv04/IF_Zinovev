package Cars;

import org.example.Car;

public class BMW extends Car {
    public BMW(String model, int year, String transmission, String color, double price) {
        super(model, year, transmission, color, "BMW", price);
    }
}
