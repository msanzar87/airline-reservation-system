import java.util.Arrays;

public class Person {
    String name;
    String nationality;
    String dateOfBirth;
    int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;

//        if (nationality.equals("Afghan")){
//            System.out.println("Come this way please");
//        }else{
//            System.out.println("Welcome!");
//        }
    }
    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    public boolean applyPassport(){
        int number = (int) (Math.random() * 2);
        if (number == 0){
            return false;
        }else{
            return true;
        }
    }

    public void chooseSeat(){
        this.seatNumber = (int) (Math.random() * 11 + 1);

    }
}
