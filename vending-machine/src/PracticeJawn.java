public class PracticeJawn {


    public static void main(String[] args) {
        String name = "buzz";
        int age = 34;

        for (int i = 0; i < 3; i++) {
            ++age;
            name += "zz";

        }
        System.out.println(name);
        System.out.println(age);
    }
}
