package assignment_2;
//Write a program to prevent external classes from directly modifying a user's account balance?

import java.util.Scanner;

class Employee {
    private double balance;
    public void balance(double balance){
        if (balance> 0){
            System.out.println("Salary is: " + balance);
        }else
        System.out.println("Not a valid amount");
    }
public double getbalance(){
        return balance;
}}
public class Encapsulation {
public static void main(String[] args){

    Employee objsal = new Employee();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter salary: ");
    double a = sc.nextDouble();
    objsal.balance(a);
    objsal.getbalance();
    }
  }