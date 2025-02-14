package Cars;

import org.example.Car;

public class Honda extends Car {
    public Honda(String model, int year, String transmission, String color, double price) {
        super(model, year, transmission, color, "Honda", price);
    }
}
