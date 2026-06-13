package assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

// MODEL CLASS
class AppUser {

    int userId;
    String name;
    double balance;
    boolean isActive;

    public AppUser(int userId, String name, double balance, boolean isActive) {
        this.userId = userId;
        this.name = name;

        // balance validation
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }

        this.isActive = isActive;
    }
}

// MAIN CLASS
public class methods {

    static ArrayList<AppUser> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // ADD USER
    public static void addUser() {

        System.out.print("Enter User ID: ");
        int id = sc.nextInt();

        if (!validateUser(id)) {
            System.out.println("User already exists!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Is Active (true/false): ");
        boolean active = sc.nextBoolean();

        // ✅ FIXED: user was NOT being added earlier
        users.add(new AppUser(id, name, balance, active));

        System.out.println("User added successfully!");
    }

    // UPDATE USER
    public static void updateUser() {

        System.out.print("Enter User ID: ");
        int id = sc.nextInt();

        int index = searchUser(id);

        if (index == -1) {
            System.out.println("User not found!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter new Name: ");
        users.get(index).name = sc.nextLine();

        System.out.print("Enter new Balance: ");
        double balance = sc.nextDouble();

        // validation
        if (balance < 0) {
            users.get(index).balance = 0;
        } else {
            users.get(index).balance = balance;
        }

        System.out.print("Is Active (true/false): ");
        users.get(index).isActive = sc.nextBoolean();

        System.out.println("User updated successfully!");
    }

    // DELETE USER
    public static void deleteUser() {

        System.out.print("Enter User ID: ");
        int id = sc.nextInt();

        int index = searchUser(id);

        if (index == -1) {
            System.out.println("User not found!");
            return;
        }

        users.remove(index);
        System.out.println("User deleted successfully!");
    }

    // SEARCH USER
    public static int searchUser(int id) {

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).userId == id) {
                return i;
            }
        }
        return -1;
    }

    // VALIDATE USER
    public static boolean validateUser(int id) {
        return searchUser(id) == -1;
    }

    // DISPLAY USERS
    public static void displayUsers() {

        if (users.isEmpty()) {
            System.out.println("No users found!");
            return;
        }

        for (AppUser u : users) {
            System.out.println(
                    "ID: " + u.userId +
                            ", Name: " + u.name +
                            ", Balance: " + u.balance +
                            ", Active: " + u.isActive
            );
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        while (true) {

            System.out.println("\n--- USER MENU ---");
            System.out.println("1. Add User");
            System.out.println("2. Update User");
            System.out.println("3. Delete User");
            System.out.println("4. Search User");
            System.out.println("5. Display Users");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addUser();
                    break;

                case 2:
                    updateUser();
                    break;

                case 3:
                    deleteUser();
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    int index = searchUser(id);

                    if (index == -1)
                        System.out.println("User not found!");
                    else
                        System.out.println("User: " + users.get(index).name);
                    break;

                case 5:
                    displayUsers();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}