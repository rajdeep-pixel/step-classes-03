package polymorphism.assigment_problems;

import java.time.LocalDate;
import java.util.Scanner;

abstract class Subscription {
    protected String name;
    protected LocalDate startDate;

    public Subscription(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public abstract LocalDate calculateRenewalDate();
    public String getName() { return name; }
}

class BasicPlan extends Subscription {
    public BasicPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }
    public LocalDate calculateRenewalDate() {
        return startDate.plusDays(30);
    }
}

class StandardPlan extends Subscription {
    public StandardPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }
    public LocalDate calculateRenewalDate() {
        return startDate.plusDays(90);
    }
}

class PremiumPlan extends Subscription {
    public PremiumPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }
    public LocalDate calculateRenewalDate() {
        return startDate.plusDays(365);
    }
}

public class StreamingPlanRenewalReminder {
    public static void main(String[] args) {
        String input = "4\nBASIC Asha 2024-01-15\nSTANDARD Ravi 2024-02-01\nPREMIUM Neha 2024-03-10\nBASIC Kiran 2024-12-20\n";
        Scanner scanner = new Scanner(input);
        
        int n = scanner.nextInt();
        Subscription[] subs = new Subscription[n];
        
        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            String name = scanner.next();
            String dateStr = scanner.next();
            LocalDate startDate = LocalDate.parse(dateStr);
            
            if (type.equals("BASIC")) {
                subs[i] = new BasicPlan(name, startDate);
            } else if (type.equals("STANDARD")) {
                subs[i] = new StandardPlan(name, startDate);
            } else {
                subs[i] = new PremiumPlan(name, startDate);
            }
        }
        
        for (Subscription sub : subs) {
            System.out.println(sub.getName() + ": " + sub.calculateRenewalDate());
        }
    }
}
