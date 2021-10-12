import java.util.Arrays;

public class MainCar {
    public static void main(String[] args) {
        String[] parts = {"tires", "keys"};
        Car[] cars = new Car[]{
                new Car("Nissan", 5000, 2020, "red", new String[]{"tires", "keys"}),
                new Car("Dodge", 11000, 2019, "blue", new String[]{"tires", "keys"}),
                new Car("Nissan", 5000, 2020, "yellow", new String[]{"tires", "filter"}),
        };
        Dealership dealership = new Dealership();
        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }
        Car newCar = dealership.getCar(1);
        newCar.setColor("red");
        System.out.println(newCar);
    }
}
