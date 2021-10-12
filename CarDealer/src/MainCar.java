import java.util.Arrays;

public class MainCar {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car("Nissan", 5000, 2020, "red", new String[]{"tires", "keys"}),
                new Car("Dodge", 11000, 2019, "blue", new String[]{"tires", "keys"}),
                new Car("Nissan", 5000, 2017, "yellow", new String[]{"tires", "filter"}),
        };
        Dealership dealership = new Dealership();
        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }

    }
}
