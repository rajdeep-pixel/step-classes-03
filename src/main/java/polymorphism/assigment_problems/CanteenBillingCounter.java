package polymorphism.assigment_problems;

import java.util.Scanner;

abstract class Customer {
    protected double amount;

    public Customer(double amount) {
        this.amount = amount;
    }

    public abstract double calculateFinalAmount();
    public abstract String getType();
}

class Student extends Customer {
    public Student(double amount) {
        super(amount);
    }
    public double calculateFinalAmount() {
        return amount * 0.90;
    }
    public String getType() { return "STUDENT"; }
}

class Staff extends Customer {
    public Staff(double amount) {
        super(amount);
    }
    public double calculateFinalAmount() {
        return amount * 0.95;
    }
    public String getType() { return "STAFF"; }
}

class Guest extends Customer {
    public Guest(double amount) {
        super(amount);
    }
    public double calculateFinalAmount() {
        return amount + 10.0;
    }
    public String getType() { return "GUEST"; }
}

public class CanteenBillingCounter {
    public static void main(String[] args) {
        String input = "3\nSTUDENT 200\nSTAFF 300\nGUEST 150\n";
        Scanner scanner = new Scanner(input);
        
        int n = scanner.nextInt();
        Customer[] customers = new Customer[n];
        
        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            double amount = scanner.nextDouble();
            
            if (type.equals("STUDENT")) {
                customers[i] = new Student(amount);
            } else if (type.equals("STAFF")) {
                customers[i] = new Staff(amount);
            } else {
                customers[i] = new Guest(amount);
            }
        }
        
        double total = 0;
        for (Customer c : customers) {
            double finalAmount = c.calculateFinalAmount();
            System.out.printf("%s: %.2f\n", c.getType(), finalAmount);
            total += finalAmount;
        }
        System.out.printf("Total: %.2f\n", total);
    }
}
