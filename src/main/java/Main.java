import org.example.*;

public class Main {
    public static void main(String[] args) {
        Car suzuki = new Suzuki("Suzuki Swift", 2020, "Automatic", "Red", "Petrol", 1.2, true);
        Car toyota = new Toyota("Toyota Corolla", 2021, "Manual", "Blue", "Petrol", 1.8, "LE");
        Car ford = new Ford("Ford Mustang", 2022, "Automatic", "Black", "Petrol", 5.0, false);
        Car bmw = new BMW("BMW M3", 2023, "Automatic", "White", "Petrol", 3.0, 473);
        Car honda = new Honda("Honda Civic", 2022, "Manual", "Silver", "Petrol", 2.0, true);

        System.out.println(suzuki.getFullInfo());
        System.out.println(toyota.getFullInfo());
        System.out.println(ford.getFullInfo());
        System.out.println(bmw.getFullInfo());
        System.out.println(honda.getFullInfo());

        // Изменение цвета автомобиля
        suzuki.changeColor("Green");
        System.out.println("Updated Suzuki Info: " + suzuki.getFullInfo());
    }
}
