package section6;
import java.util.ArrayList;
import java.util.Scanner;

public class methods {

    static ArrayList<String> users = new ArrayList<>();
   // Add User
    public static void adduser() {
   
        users.add("Akanksha");
       System.out.println("Added: Akanksha");

        users.add("Sushma");
        System.out.println("Added: Sushma");
    	
    }
    // View User
    public static void viewuser() {
    	
    	for(String i : users) {
    		System.out.println("View users " + i);}
    	}
    // Search User
    public static void serachuser() {
    	
    for(String a : users) {
    	
    	 if(users == users) {
    		 Scanner sc1 = new Scanner(System.in);
    	    	System.out.println("Search for user: ");
    	    	String b = sc1.next();
    	    	System.out.println("User found: " + a);
    	    }
    	    else {
    	    	System.out.println("User not found: "+ a);
    	    }
    }}   
   public static void main(String[] args) {
	   adduser();
	   viewuser();
	   serachuser();   
    }
}
