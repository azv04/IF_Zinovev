package org.example;

public abstract class Car {
    public String manufacturer;
    protected String model;
    protected int year;
    protected String transmission; // автоматическая/механическая
    protected String color;
    protected double price;

    public Car(String model, int year, String transmission, String color, String manufacturer, double price) {
        this.model = model;
        this.year = year;
        this.transmission = transmission;
        this.color = color;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getFullInfo() {
        return "Модель: " + model + ", Год выпуска: " + year + ", Коробка: " + transmission +
                ", Цвет: " + color + ", Производитель: " + manufacturer + ", Цена: $" + price;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}