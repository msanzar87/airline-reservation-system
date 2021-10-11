public class MainCar {
    public static void main(String[] args) {
        Car nissan = new Car();
        nissan.make = "Nissan";
        nissan.price = 5000;
        nissan.year = 2020;
        nissan.color = "red";

        Car dodge = new Car();
        dodge.make = "Dodge";
        dodge.price = 11000;
        dodge.year = 2019;
        dodge.color = "blue";

        System.out.println(nissan.make);
        System.out.println(nissan.price);
    }
}
