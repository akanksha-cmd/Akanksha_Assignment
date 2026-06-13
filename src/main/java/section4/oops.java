package section4;

class User{
	int userId;
	String name;
	
	User(	int userId, String name){
		this.userId = userId;
		this.name = name;	
	}
}
class Customer extends User {
	
	String email;
	Customer(){
	super(101, "Akanksha");
	this.email = "akanksha@gmail.com";
	
	 }		
}
public class oops {

	public static void main(String[] args) {
		
		Customer obj = new Customer();
		System.out.println(obj.userId);
		System.out.println(obj.name);
		System.out.println(obj.email);

	}
}
