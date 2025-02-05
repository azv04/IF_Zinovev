package org.example;

public class BMW {
    private int horsepower;

    public BMW(String model, int year, String transmission, String color, String fuelType, double engineCapacity, int horsepower) {
        super(model, year, transmission, color, fuelType, engineCapacity);
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getFullInfo() {
        return super.getFullInfo() + ", Horsepower: " + horsepower;
    }
}
