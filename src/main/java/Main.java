import Cars.BMW;
import Cars.Ford;
import Cars.Honda;
import Cars.Suzuki;
import Cars.Toyota;
import org.example.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Suzuki("Vitara", 2010, "Автомат", "Зеленый", 15000));
        cars.add(new Toyota("Camry", 2015, "Автомат", "Синий", 20000));
        cars.add(new Ford("Focus", 2008, "Механика", "Красный", 12000));
        cars.add(new BMW("X5", 2020, "Автомат", "Черный", 50000));
        cars.add(new Honda("Civic", 2012, "Автомат", "Зеленый", 18000));
        cars.add(new Suzuki("Swift", 2005, "Механика", "Серый", 8000));
        cars.add(new Toyota("Corolla", 2019, "Автомат", "Белый", 22000));
        cars.add(new Ford("Mustang", 2021, "Автомат", "Красный", 35000));
        cars.add(new BMW("3 Series", 2018, "Автомат", "Синий", 40000));
        cars.add(new Honda("Accord", 2007, "Механика", "Зеленый", 16000));

        printRecentCars(cars);
        changeGreenToRed(cars);
        printCarsByManufacturer(cars, "Toyota");
    }

    public static void printRecentCars(List<Car> cars) {
        for (Car car : cars) {
            if (car.getYear() > 2006) {
                System.out.println(car.getFullInfo());
            } else {
                System.out.println("Устаревший авто: " + car.getFullInfo());
            }
        }
    }

    public static void changeGreenToRed(List<Car> cars) {
        for (Car car : cars) {
            if ("Зеленый".equals(car.getColor())) {
                car.changeColor("Красный");
                System.out.println("Цвет автомобиля изменен на красный: " + car.getFullInfo());
            }
        }
    }

    public static void printCarsByManufacturer(List<Car> cars, String manufacturer) {
        System.out.println("Автомобили производителя " + manufacturer + ":");
        for (Car car : cars) {
            if (car.manufacturer.equals(manufacturer)) {
                System.out.println(car.getFullInfo());
            }
        }
    }
}
