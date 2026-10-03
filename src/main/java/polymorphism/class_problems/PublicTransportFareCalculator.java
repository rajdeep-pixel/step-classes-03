package polymorphism.class_problems;

import java.util.Scanner;

abstract class Transport {
    protected double distance;

    public Transport(double distance) {
        this.distance = distance;
    }

    public abstract double calculateFare();
    public abstract String getType();
}

class Bus extends Transport {
    public Bus(double distance) {
        super(distance);
    }
    public double calculateFare() {
        double fare = 2.0 + (0.10 * distance);
        return Math.min(fare, 10.0);
    }
    public String getType() { return "BUS"; }
}

class Train extends Transport {
    public Train(double distance) {
        super(distance);
    }
    public double calculateFare() {
        return 3.0 + (0.15 * distance);
    }
    public String getType() { return "TRAIN"; }
}

class Metro extends Transport {
    private double peakHourFactor;

    public Metro(double distance, double peakHourFactor) {
        super(distance);
        this.peakHourFactor = peakHourFactor;
    }
    public double calculateFare() {
        return (1.50 + 0.20 * distance) * peakHourFactor;
    }
    public String getType() { return "METRO"; }
}

public class PublicTransportFareCalculator {
    public static void main(String[] args) {
        String input = "3\nBUS 15\nTRAIN 50\nMETRO 10 1.5\n";
        Scanner scanner = new Scanner(input);
        
        int n = scanner.nextInt();
        Transport[] transports = new Transport[n];
        
        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            double distance = scanner.nextDouble();
            
            if (type.equals("BUS")) {
                transports[i] = new Bus(distance);
            } else if (type.equals("TRAIN")) {
                transports[i] = new Train(distance);
            } else {
                double factor = scanner.nextDouble();
                transports[i] = new Metro(distance, factor);
            }
        }
        
        double total = 0;
        for (Transport t : transports) {
            double fare = t.calculateFare();
            System.out.printf("%s: %.2f\n", t.getType(), fare);
            total += fare;
        }
        System.out.printf("\nTotal: %.2f\n", total);
    }
}
