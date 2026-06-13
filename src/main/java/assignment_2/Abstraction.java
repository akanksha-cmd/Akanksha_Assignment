package assignment_2;

import java.util.Scanner;

// Abstract Class
abstract class Account {

    abstract void deposit();

    abstract void withdraw();

    abstract void calculateInterest();
}

// Child Class
class Manage extends Account {

    double balance = 0;

    Scanner sc = new Scanner(System.in);

    @Override
    void deposit() {

        System.out.println("Enter amount for deposit:");
        double amount = sc.nextDouble();

        balance = balance + amount;

        System.out.println("Amount deposited successfully");
        System.out.println("Current Balance: " + balance);
    }

    @Override
    void withdraw() {

        System.out.println("Enter amount for withdrawal:");
        double amount = sc.nextDouble();

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println("Amount withdrawn successfully");
            System.out.println("Current Balance: " + balance);

        } else {

            System.out.println("Insufficient Balance");
        }
    }

    @Override
    void calculateInterest() {

        double interest = balance * 0.05; // 5% interest

        System.out.println("Interest on current balance: " + interest);
    }
}

// Main Class
public class Abstraction {

    public static void main(String[] args) {

        Manage obj = new Manage();

        obj.deposit();
        obj.withdraw();
        obj.calculateInterest();
    }
}