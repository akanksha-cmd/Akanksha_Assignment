package section9;

public class Strings {

	public static void main(String[] args) {
		
		String name = "Building";
		//length
		System.out.println("Length of the string: " + name.length());
		//validate
		System.out.println("Validate the string is empty or not: " + name.isEmpty());
		
		//reverse by using StringBuilder
		StringBuilder a = new StringBuilder("Building");
		a.reverse();
		System.out.println("Original string: "+ name);
		System.out.println("Reverse string: " + a);
		
		
	}

}
