package src.main.model.account;

import src.main.model.account.impl.Taxable;

import java.text.DecimalFormat;

public abstract class Account implements Taxable {
private String id;
private String name;
private double balance;

    public Account(String id, String name, double balance) {
        if (id == null || id.isEmpty() || name == null || name.isEmpty()){
            throw new IllegalArgumentException("INVALID PARAMS");
        }
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public Account(Account source) {
        this.id = source.id;
        this.name = source.name;
        this.balance = source.balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isEmpty()){
            throw new IllegalArgumentException("INVALID ID");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("INVALID NAME");
        }
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public abstract void deposit(double amount);
    public abstract boolean withdraw(double amount);
    public abstract Account clone();

    protected double round(double amount) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        return Double.parseDouble(formatter.format(amount));
    }

    @Override
    public String toString() {
        return (this.getClass().getSimpleName()) + "    " +
                "\t" + this.getId() + "" +
                "\t" + this.getName() + "" +
                "\t$" + this.getBalance() + "";
    }

    @Override
    public void tax(double income) {

    }
}


