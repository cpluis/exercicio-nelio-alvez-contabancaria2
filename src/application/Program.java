package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter com amount number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is tehre aninitial deposit (y/n)?: ");
        char response = sc.next().charAt(0);
        if( response == 'y'){
            System.out.print("Entrer initial deposit value: ");
            double inicialDeposit = sc.nextDouble();
            account = new Account(number, holder, inicialDeposit);
        }else{
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account data"+account);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account data: ");
        System.out.println(account);


        System.out.println();
        System.out.println("Account data"+account);
        System.out.println();
        System.out.print("Enter withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Update account data: ");
        System.out.println(account);


        sc.close();
    }
}