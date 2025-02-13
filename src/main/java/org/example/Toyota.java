package org.example;

public class Toyota extends Car {
    private String trimLevel;

    public Toyota(String model, int year, String transmission, String color, String fuelType, double engineCapacity, String trimLevel) {
        super(model, year, transmission, color, fuelType, engineCapacity);
        this.trimLevel = trimLevel;
    }

    public String getTrimLevel() {
        return trimLevel;
    }

    public String getFullInfo() {
        return super.getFullInfo() + ", Trim Level: " + trimLevel;
    }
}
