package polymorphism.assigment_problems;

import java.util.Scanner;

abstract class Employee {
    protected String name;
    protected double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public abstract double calculateBonus();
    public String getName() { return name; }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double monthlySalary) {
        super(name, monthlySalary);
    }
    public double calculateBonus() {
        return monthlySalary * 0.10;
    }
}

class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, double monthlySalary) {
        super(name, monthlySalary);
    }
    public double calculateBonus() {
        return monthlySalary * 0.05;
    }
}

class InternEmployee extends Employee {
    public InternEmployee(String name, double monthlySalary) {
        super(name, monthlySalary);
    }
    public double calculateBonus() {
        return 2000.0;
    }
}

public class FestivalBonusCalculator {
    public static void main(String[] args) {
        String input = "3\nFULLTIME Asha 50000\nPARTTIME Ravi 30000\nINTERN Neha 15000\n";
        Scanner scanner = new Scanner(input);
        
        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];
        
        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            String name = scanner.next();
            double salary = scanner.nextDouble();
            
            if (type.equals("FULLTIME")) {
                employees[i] = new FullTimeEmployee(name, salary);
            } else if (type.equals("PARTTIME")) {
                employees[i] = new PartTimeEmployee(name, salary);
            } else {
                employees[i] = new InternEmployee(name, salary);
            }
        }
        
        double total = 0;
        for (Employee e : employees) {
            double bonus = e.calculateBonus();
            System.out.printf("%s: %.2f\n", e.getName(), bonus);
            total += bonus;
        }
        System.out.printf("Total Bonus: %.2f\n", total);
    }
}
