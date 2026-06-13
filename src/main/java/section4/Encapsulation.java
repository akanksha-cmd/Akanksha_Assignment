package section4;

class Userss{
	// instance variable
	private int userId;
	private String name;
	private String email;
// set method
public void User(int userId, String name , String email)

//constructor
//public Userss(int userId, String name , String email) 
{
this.userId = userId;
this.name = name;
this.email = email;
}
// get
 public String gettusers() {
	 return name;
 }
public String getemail() {
	 return email;
 }
 public int getuserId () {
	 return userId;
 }
 // To print
 void display() {
	  System.out.println(getuserId());
	  System.out.println(gettusers());
	  System.out.println(getemail());
 }
}
public class Encapsulation {

	public static void main(String[] args) {
		// constructor
//  Userss user1 = new Userss(101, "Akanksha", "akanksha@gmail.com"); 
//  user1.display();
//  Userss user2 = new Userss(102, "Akhilesh", "akaa@gmail.com");
//  user2.display();
		
		// method
		Userss obj = new Userss();
		obj.User(101, "Akash", "akash@gmail.com");
		obj.display();
		obj.User(102, "Shivam", "shivam@gmail.com");
		obj.display();
		
		
  	
  	
	}
}
