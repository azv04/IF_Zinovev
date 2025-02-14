package Cars;

import org.example.Car;

public class Ford extends Car {
    public Ford(String model, int year, String transmission, String color, double price) {
        super(model, year, transmission, color, "Ford", price);
    }
}
