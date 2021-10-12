import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person("Munir","USA","1/11/1111",5);
        Person person2 = new Person(person);
        System.out.println("Name: " + person.name + "\n"
                +                  "Nationality: " + person.nationality + "\n"
                +                  "Date of Birth: " + person.dateOfBirth + "\n"
                +                  "Seat Number: " + person.seatNumber + "\n");
        System.out.println("Name: " + person2.name + "\n"
                +                  "Nationality: " + person2.nationality + "\n"
                +                  "Date of Birth: " + person2.dateOfBirth + "\n"
                +                  "Seat Number: " + person2.seatNumber + "\n");
        if (person.applyPassport() == true){
            System.out.println("Congratulations! "+person.getName()+"You're paspport was approved!");
        }else{
            System.out.println("Sorry, "+person.getName()+ "you're passport couldnt be processed!");
        }
    }

    }


