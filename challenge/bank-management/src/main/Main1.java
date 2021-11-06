package src.main;

import src.main.model.account.Chequing;
import src.main.model.account.Loan;
import src.main.model.account.Savings;

public class Main1 {
    public static void main(String[] args) {
        Chequing chequing = new Chequing("1","Munir",1000.00);
        Savings savings = new Savings("2","Buzz",10000.00);
        Loan loan = new Loan("3","Chris",2000.00);

        System.out.println(chequing);
        System.out.println(savings);
        System.out.println(loan);


    }
}
