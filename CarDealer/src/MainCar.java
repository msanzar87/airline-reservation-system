import java.util.Arrays;

public class MainCar {
    public static void main(String[] args) {
        String[] parts = {"tires", "keys"};

        Car nissan = new Car("Nissan",5000,2020,"red",parts);
        Car dodge = new Car("Dodge",11000,2019,"blue",parts);
        Car nissan2 = new Car(nissan);
        nissan.setColor("Jet Black");
        dodge.setPrice(8000);
        nissan2.setColor("yellow");
        nissan2.setParts(new String[] {"tires","filters"});
        nissan2.setColor("yellow");

        System.out.println(Arrays.toString(nissan2.getParts()));



    }
}
