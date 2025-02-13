package org.example;

public class Ford extends Car {
    private boolean isElectric;

    public Ford(String model, int year, String transmission, String color, String fuelType, double engineCapacity, boolean isElectric) {
        super(model, year, transmission, color, fuelType, engineCapacity);
        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public String getFullInfo() {
        return super.getFullInfo() + ", Is Electric: " + isElectric;
    }
}
