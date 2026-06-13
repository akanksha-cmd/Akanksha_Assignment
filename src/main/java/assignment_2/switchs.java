package assignment_2;

import java.util.Scanner;

// Create a simple banking application that uses switch
// statements to perform operations like deposit, withdraw, and check balance.
public class switchs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operations: ");
        String a = sc.next();
        String input = a;
        switch (input) {
            case "deposit":
                System.out.println("Amount Deposit successfully");
            break;
            case "withdrawn":
                System.out.println("Amount Withdrawn successfully");
                break;
            case "balance":
                System.out.println("Amount Balance viewed successfully");
                break;
            default:
             System.out.println("Invalid operations");
         }
        }
    }
