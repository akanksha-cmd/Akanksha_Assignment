package assignment_2;
// Base Class
class User {

    int userId;
    String name;

    // Constructor
    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    void displayUser() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
    }
}

// Child Class
class PremiumUser extends User {

    double membershipFee;

    // Constructor
    PremiumUser(int userId, String name, double membershipFee) {
        super(userId, name); // calling parent constructor
        this.membershipFee = membershipFee;
    }

    void displayPremiumUser() {
        displayUser();
        System.out.println("Membership Fee: " + membershipFee);
    }
}

// Child Class
class AdminUser extends PremiumUser {

    String role;

    // Constructor
    AdminUser(int userId, String name, double membershipFee, String role) {
        super(userId, name, membershipFee); // calling parent constructor
        this.role = role;
    }

    void displayAdminUser() {
        displayPremiumUser();
        System.out.println("Role: " + role);
    }
}

// Main Class
public class oops {

    public static void main(String[] args) {

        // Object creation using constructors
        User u1 = new User(1, "Akanksha");
        PremiumUser p1 = new PremiumUser(2, "Riya", 999.0);
        AdminUser a1 = new AdminUser(3, "Simran", 1999.0, "System Admin");

        System.out.println("---- USER ----");
        u1.displayUser();

        System.out.println("---- PREMIUM USER ----");
        p1.displayPremiumUser();

        System.out.println("---- ADMIN USER ----");
        a1.displayAdminUser();
    }
}