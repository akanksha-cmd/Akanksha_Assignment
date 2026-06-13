package section5;

import java.util.Scanner;

public class switchclass {

	public static void main(String[] args) {
	
		// Create menu-driven program
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 for Check Balance");
		System.out.println("Press 2 for Deposit Money");
		System.out.println("Press 3 for Withdraw Money");
		System.out.println("Press 4 for Exit");
		System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
        switch (choice) {       
        case 1: 
        System.out.println("Here is your balance");
        break;
        case 2 :
        	System.out.println("Money is deposited");
        	break;
        case 3 :
        	System.out.println("Money is withdrawn");
        	break;
        case 4 :
        	System.out.println("Exit successfully");
        	break;
        	
        default:
        	System.out.println("Please press number from the menu only");
        
       
        }
       

	}

}
