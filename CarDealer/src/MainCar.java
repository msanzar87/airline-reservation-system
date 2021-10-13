import java.util.Arrays;
import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car[] cars = new Car[]{
                new Car("Nissan", 5000, 2020, "red", new String[]{"tires", "keys"}),
                new Car("Dodge", 11000, 2019, "blue", new String[]{"tires", "keys"}),
                new Car("Nissan", 5000, 2017, "yellow", new String[]{"tires", "filter"}),
        };
        Dealership dealership = new Dealership();
        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
        String make1 = scan.nextLine();
        System.out.print("Enter your budget: ");
        int budget = scan.nextInt();
        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }
scan.close();
    }
}
