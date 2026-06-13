package section5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class loops {

	public static void main(String[] args) {
		// Using ArrayList
		ArrayList <String> users = new ArrayList <String>();
		users.add("Akanksha");
		users.add("Riya");
		users.add("Sonali");
		users.add("Priya");
		  for(int i = 0; i < users.size(); i++) {
	            System.out.println(users.get(i));
		}
	// Using array
	 String name[] = {"Simran", "Simia", "Sheenu"};
	 for(int i = 0; i< name.length; i++) {
		 System.out.println(name[i])	;
		 }
		

	}

}
