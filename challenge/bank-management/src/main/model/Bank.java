package src.main.model;

import src.main.model.account.Account;

import java.util.ArrayList;

public class Bank {
   private ArrayList<Account> accounts;
   private ArrayList<Transaction> transactions;

    public Bank() {
        this.accounts = new ArrayList<Account>();
        this.transactions = new ArrayList<Transaction>();
    }
    public void addAccount(Account account){
        this.accounts.add(account.clone());
    }
}

