public class MainCar {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan",5000,2020,"red");

        Car dodge = new Car("Dodge",11000,2019,"blue");
        nissan.setColor("Jet Black");
        dodge.setPrice(8000);

        double newPrice = nissan.getPrice() / 2;
        nissan.setPrice(newPrice);
        System.out.println(nissan.getPrice());
        System.out.println(dodge.getPrice());

    }
}
