import java.util.Scanner;

public class AccountManagement {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    Account konto = new Account(123,"Gus",500.10);
        System.out.println(konto.toString());



    }
}
