package src.main.model.account;


public class Chequing extends Account {
    private final static double OVERDRAFT_FEE = 5.50;
    private final static double OVERDRAFT_LIMIT = -200;

    public Chequing(String id, String name, double balance) {
        super(id, name, balance);
    }

    public Chequing(Chequing source) {
        super(source);
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public boolean withdraw(double amount) {
        if (super.getBalance() - amount < OVERDRAFT_LIMIT) {
            return false;
        } else if (super.getBalance() - amount < 0) {
            super.setBalance(super.round(super.getBalance() - amount - OVERDRAFT_FEE));
            return true;
        } else {
            super.setBalance(super.round(super.getBalance() - amount));
            return true;
        }
    }
}