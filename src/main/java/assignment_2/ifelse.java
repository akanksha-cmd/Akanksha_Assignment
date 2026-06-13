package assignment_2;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount for deposit:");
        String a = sc.next();
        if (a.equals("active")){
            System.out.println("Account active successfully");
        } else if (a.equals("inactive")) {
            System.out.println("Account is inactive");
        } else if (a.equals("suspended")) {
            System.out.println("Account is suspended");
        } else if (a.equals("blocked")) {
            System.out.println("Account is blocked");
    } else {
            System.out.println("Values doesn't match");
        }
}}
