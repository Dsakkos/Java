import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems) {
        double sum = 0;
        for (int i = 0; i < lineItems.length; i++) {
            sum += lineItems[i];
        }
        return sum;
    }


    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s\n", i, menuItems.get(i));
    }
}

    public void addCustomer(ArrayList<String> newCustomers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, " + userName + "!");
        System.out.printf(" There are %s people ahead of you.\n", newCustomers.size());
        newCustomers.add(userName);
        System.out.println(newCustomers);
    }
}

