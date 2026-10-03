package polymorphism.class_problems;

import java.util.Scanner;

abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract double calculateFinalAmount();
    public abstract String getType();
}

class CardPayment extends Payment {
    public CardPayment(double amount) {
        super(amount);
    }
    public double calculateFinalAmount() {
        return amount + (amount * 0.02);
    }
    public String getType() { return "CARD"; }
}

class WalletPayment extends Payment {
    public WalletPayment(double amount) {
        super(amount);
    }
    public double calculateFinalAmount() {
        return amount + (amount * 0.01);
    }
    public String getType() { return "WALLET"; }
}

class BankTransferPayment extends Payment {
    public BankTransferPayment(double amount) {
        super(amount);
    }
    public double calculateFinalAmount() {
        return amount;
    }
    public String getType() { return "BANKTRANSFER"; }
}

public class PaymentSystemFeeCalculation {
    public static void main(String[] args) {
        String input = "3\nCARD 1000\nWALLET 500\nBANKTRANSFER 2000\n";
        Scanner scanner = new Scanner(input);
        
        int n = scanner.nextInt();
        Payment[] payments = new Payment[n];
        
        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            double amount = scanner.nextDouble();
            if (type.equals("CARD")) {
                payments[i] = new CardPayment(amount);
            } else if (type.equals("WALLET")) {
                payments[i] = new WalletPayment(amount);
            } else {
                payments[i] = new BankTransferPayment(amount);
            }
        }
        
        double total = 0;
        for (Payment p : payments) {
            double finalAmount = p.calculateFinalAmount();
            System.out.printf("%s: %.2f\n", p.getType(), finalAmount);
            total += finalAmount;
        }
        System.out.printf("\nTotal: %.2f\n", total);
    }
}
