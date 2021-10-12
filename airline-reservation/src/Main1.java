import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        String[] passport = {};
        Person person = new Person("Munir", "American", "01/02/1987", 5,passport);
        if (person.applyPassport() == true) {
        }
        System.out.println("Name: " + person.getName() + "\n" +
                "Nationality: " + person.getNationality() + "\n" +
                "Date of Birth: " + person.getDateOfBirth() + "\n" +
                "Seat Number: " + person.getSeatNumber() + "\n" + "Passport: " +
                Arrays.toString(person.getPassport())+ "\n");
    }

}
