import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
    Person person = new Person("Munir","USA","1/11/1111",5);
    person.setName("Billy");
    System.out.println(person.getName());

    if (person.applyPassport() == false){
        System.out.println("Congrats "+person.getName()+ " passport approved!");
    }else {
        System.out.println("We're Sorry "+person.getName());
    }
    }

}
