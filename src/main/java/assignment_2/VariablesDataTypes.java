package assignment_2;
public class VariablesDataTypes {
    private int userId;
    private String name;
    private double balance;
    private boolean isActive;
    public VariablesDataTypes(int userId, String name, double balance, boolean isActive) {
        this.userId = userId;
        this.name = name;
        setBalance(balance);
        this.isActive = isActive;
    }
    public int getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public void setBalance(double balance) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }
    public static void main(String[] args) {

        VariablesDataTypes u1 = new VariablesDataTypes(101, "Akanksha", -500, true);

        System.out.println("User ID: " + u1.getUserId());
        System.out.println("Name: " + u1.getName());
        System.out.println("Balance: " + u1.getBalance());
        System.out.println("Active: " + u1.isActive());
    }
}