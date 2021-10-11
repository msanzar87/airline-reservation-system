import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Munir";
        person.dateOfBirth = "1/11/1111";
        person.nationality = "USA";
        person.seatNumber = 5;
        person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);

    }

    }


