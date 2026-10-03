package polymorphism.class_problems;

import java.util.Scanner;

abstract class Delivery {
    protected double weight;
    protected double distance;

    public Delivery(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public abstract double calculateFee();
    public abstract String getType();
}

class StandardDelivery extends Delivery {
    public StandardDelivery(double weight, double distance) {
        super(weight, distance);
    }
    public double calculateFee() {
        return 5.0 + (0.50 * weight) + (0.10 * distance);
    }
    public String getType() { return "STANDARD"; }
}

class ExpressDelivery extends Delivery {
    public ExpressDelivery(double weight, double distance) {
        super(weight, distance);
    }
    public double calculateFee() {
        return 20.0 + (1.00 * weight) + (0.20 * distance);
    }
    public String getType() { return "EXPRESS"; }
}

class InternationalDelivery extends Delivery {
    private double customsFee;

    public InternationalDelivery(double weight, double distance, double customsFee) {
        super(weight, distance);
        this.customsFee = customsFee;
    }
    public double calculateFee() {
        return 35.0 + (2.00 * weight) + (0.50 * distance) + customsFee;
    }
    public String getType() { return "INTERNATIONAL"; }
}

public class DeliveryFeeCalculator {
    public static void main(String[] args) {
        String input = "3\nSTANDARD 10 50\nEXPRESS 5 20\nINTERNATIONAL 20 100 30\n";
        Scanner scanner = new Scanner(input);
        
        int n = scanner.nextInt();
        Delivery[] deliveries = new Delivery[n];
        
        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            double weight = scanner.nextDouble();
            double distance = scanner.nextDouble();
            
            if (type.equals("STANDARD")) {
                deliveries[i] = new StandardDelivery(weight, distance);
            } else if (type.equals("EXPRESS")) {
                deliveries[i] = new ExpressDelivery(weight, distance);
            } else {
                double customsFee = scanner.nextDouble();
                deliveries[i] = new InternationalDelivery(weight, distance, customsFee);
            }
        }
        
        double total = 0;
        for (Delivery d : deliveries) {
            double fee = d.calculateFee();
            System.out.printf("%s: %.2f\n", d.getType(), fee);
            total += fee;
        }
        System.out.printf("\nTotal: %.2f\n", total);
    }
}
