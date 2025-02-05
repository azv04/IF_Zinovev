package org.example;

public class Car {
    private String model;
    private int year;
    private String transmission; // автоматическая/механическая
    private String color;
    private String fuelType; // бензин/дизель/электро
    private double engineCapacity; // объем двигателя

    public Car(String model, int year, String transmission, String color, String fuelType, double engineCapacity) {
        this.model = model;
        this.year = year;
        this.transmission = transmission;
        this.color = color;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public String getFullInfo() {
        return "Model: " + model +
                ", Year: " + year +
                ", Transmission: " + transmission +
                ", Color: " + color +
                ", Fuel Type: " + fuelType +
                ", Engine Capacity: " + engineCapacity + "L";
    }
}