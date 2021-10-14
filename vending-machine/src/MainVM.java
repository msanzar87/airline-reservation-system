import java.util.Scanner;

public class MainVM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                System.out.println("\t************************************************");
                System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
                System.out.println("\t************************************************");
        Item[][] items = new Item[][] {
                { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
                { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
                { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };
        Machine machine = new Machine(items);

        System.out.println("How much you got?");
        double money = scan.nextDouble();
        if (money < 1.49){
            System.out.println("Sorry not enough moola!");
        }
        while (money >= 1.49) {
            System.out.println("Would you like to buy a soda?");
            String response = scan.next();

            if (response.equals("yes")) {

                System.out.print("Pick a row: ");
                int row = scan.nextInt();

                System.out.print("Pick a spot in the row: ");
                int spot = scan.nextInt();
                if (money >= machine.getItem(row, spot).getPrice() && machine.getItem(row, spot).getQuantity() > 0) {
                    System.out.println("Drink dispensing!");
                    machine.dispense(row, spot);
                    money -= machine.getItem(row, spot).getPrice();
                    System.out.println("You have $" + money + " left!");
                } else if (machine.getItem(row, spot).getQuantity() < 1) {
                    System.out.println("This item is sold out!");

                } else {
                    System.out.println("You don't have enough money!");
                }
            }else{
                System.out.println("Goodbye!");
                break;
            }
        }
        scan.close();
    }
}
