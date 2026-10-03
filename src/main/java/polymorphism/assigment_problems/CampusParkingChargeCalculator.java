package polymorphism.assigment_problems;

import java.util.Scanner;

abstract class Vehicle {
    protected int hours;

    public Vehicle(int hours) {
        this.hours = hours;
    }

    public abstract double calculateCharge();
    public abstract String getType();
}

class Bike extends Vehicle {
    public Bike(int hours) {
        super(hours);
    }
    public double calculateCharge() {
        return hours * 10.0;
    }
    public String getType() { return "BIKE"; }
}

class Car extends Vehicle {
    public Car(int hours) {
        super(hours);
    }
    public double calculateCharge() {
        if (hours == 0) return 0;
        return 30.0 + ((hours - 1) * 20.0);
    }
    public String getType() { return "CAR"; }
}

class Truck extends Vehicle {
    public Truck(int hours) {
        super(hours);
    }
    public double calculateCharge() {
        return Math.max(hours * 50.0, 100.0);
    }
    public String getType() { return "TRUCK"; }
}

public class CampusParkingChargeCalculator {
    public static void main(String[] args) {
        String input = "4\nBIKE 3\nCAR 4\nTRUCK 1\nCAR 1\n";
        Scanner scanner = new Scanner(input);
        
        int n = scanner.nextInt();
        Vehicle[] vehicles = new Vehicle[n];
        
        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            int hours = scanner.nextInt();
            
            if (type.equals("BIKE")) {
                vehicles[i] = new Bike(hours);
            } else if (type.equals("CAR")) {
                vehicles[i] = new Car(hours);
            } else {
                vehicles[i] = new Truck(hours);
            }
        }
        
        double total = 0;
        for (Vehicle v : vehicles) {
            double charge = v.calculateCharge();
            System.out.printf("%s: %.2f\n", v.getType(), charge);
            total += charge;
        }
        System.out.printf("Total: %.2f\n", total);
    }
}
