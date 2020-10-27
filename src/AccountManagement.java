import java.util.Scanner;

public class AccountManagement {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

    Account konto = new Account(123,"Gus",500.10);

        System.out.println(konto.toString());
        System.out.println("Tester deposit");
        konto.deposit();

        System.out.println("Nu tester vi withdrawal");
        konto.withdrawal();

        System.out.println("Tester TRANSFER\nHvor meget vil du overføre?");
        double belob = scan.nextDouble();
        konto.transfer(belob);






    }
}
