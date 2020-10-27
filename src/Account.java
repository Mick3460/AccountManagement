import java.util.Scanner;

public class Account {

    static Scanner scan = new Scanner(System.in);

    private int accountID;
    private String name;
    private double balance;

    Account(int accountID, String name, double balance) {
        this.accountID = accountID;
        this.name = name;
        this.balance = balance;
    }

    int getAccountID() {return this.accountID;}

    double getBalance() {return this.balance;}

    String getName() {return this.name;}

    public String toString() {
        return "accountID = " + getAccountID() + "\nName = " + getName() + "\nBalance = " + getBalance();
    }

    withdrawal(){

    }

    void deposit(double amount){


    }

    transfer(){

    }





}
