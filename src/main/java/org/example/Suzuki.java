package org.example;

public class Suzuki extends Car {
    private boolean hasSunroof;

    public Suzuki(String model, int year, String transmission, String color, String fuelType, double engineCapacity, boolean hasSunroof) {
        super(model, year, transmission, color, fuelType, engineCapacity);
        this.hasSunroof = hasSunroof;
    }

    public boolean hasSunroof() {
        return hasSunroof;
    }

    public String getFullInfo() {
        return super.getFullInfo() + ", Has Sunroof: " + hasSunroof;
    }

}
