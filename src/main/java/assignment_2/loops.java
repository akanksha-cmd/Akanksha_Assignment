package assignment_2;

public class loops {

    public static void main(String[] args) {

        String[] users = {"Sonam", "Simran", "Sanchaita", "Akanksha"};
        int[] daysInactive = {80, 95, 100, 120};

        System.out.println("Inactive accounts older than 90 days:");

        for (int i = 0; i < users.length; i++) {

            if (daysInactive[i] > 90) {
                System.out.println(users[i] + " - " + daysInactive[i] + " days");
            }
        }
    }
}
