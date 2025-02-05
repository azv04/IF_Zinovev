package org.example;

public class Honda {
    private boolean hasNavigationSystem;

    public Honda(String model, int year, String transmission, String color, String fuelType, double engineCapacity, boolean hasNavigationSystem) {
        super(model, year, transmission, color, fuelType, engineCapacity);
        this.hasNavigationSystem = hasNavigationSystem;
    }

    public boolean hasNavigationSystem() {
        return hasNavigationSystem;
    }
    public boolean hasNavigationSystem() {
        return hasNavigationSystem;
    }

    public String getFullInfo() {
        return super.getFullInfo() + ", Has Navigation System: " + hasNavigationSystem;
    }
}
