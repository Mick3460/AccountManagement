import java.util.Scanner;

public class Account {

    static Scanner scan = new Scanner(System.in);

    double bankingFee = 5;
    private int accountID;
    private String name;
    private double balance;

    Account(int accountID, String name, double balance) {
        this.accountID = accountID;
        this.name = name;
        this.balance = balance;
    }

    //Default constructor.
    Account(){    }

    int getAccountID() {return this.accountID;}

    double getBalance() {return this.balance;}

    String getName() {return this.name;}

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "accountID = " + getAccountID() + "\nName = " + getName() + "\nBalance = " + getBalance();
    }


    double withdrawal (){
        System.out.println("Angiv det beløb du vil HÆVE: \n");
        double customerInput = scan.nextDouble();

        if (customerInput > getBalance() ){
            System.out.println("Den går ikke makker");
            return -1;
        } else {
        setBalance(getBalance() - customerInput);
            System.out.println("Du har nu hævet, og din kontobalance er: " + getBalance());
        return getBalance();
        }

    }

    void deposit(){
        System.out.println("Angiv det beløb du vil indsætte: \n");
        double customerInput = scan.nextDouble();
        setBalance(getBalance() + customerInput);
        System.out.println(getBalance());
    }

    void transfer(double belob){

        if ((belob +5) > getBalance() ){
            System.out.println("Den går ikke makker");
        } else {
            setBalance(getBalance() - belob - bankingFee);
            System.out.println("Du har nu overført: " + belob + " og din kontobalance er: " + getBalance());
            System.out.println("Husk det koster 5kr i gebyrer tiihiii :)");

        }
    }







}
