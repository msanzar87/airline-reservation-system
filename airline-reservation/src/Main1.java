import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person("Munir", "American", "01/02/1987", 5);
        if (person.applyPassport() == true) {
            person.setPassport();
        }
        System.out.println(person);
    }

}
