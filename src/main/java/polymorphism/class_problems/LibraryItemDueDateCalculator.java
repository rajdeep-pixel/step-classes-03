package polymorphism.class_problems;

import java.time.LocalDate;
import java.util.Scanner;

abstract class LibraryItem {
    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public abstract int getBorrowingPeriod();

    public String getTitle() {
        return title;
    }
}

class Book extends LibraryItem {
    public Book(String title) {
        super(title);
    }
    public int getBorrowingPeriod() { return 14; }
}

class DVD extends LibraryItem {
    public DVD(String title) {
        super(title);
    }
    public int getBorrowingPeriod() { return 7; }
}

class Magazine extends LibraryItem {
    public Magazine(String title) {
        super(title);
    }
    public int getBorrowingPeriod() { return 3; }
}

public class LibraryItemDueDateCalculator {
    public static void main(String[] args) {
        String input = "3\nBOOK \"1984\"\nDVD \"The Matrix\"\nMAGAZINE \"Forbes Issue 500\"\n";
        Scanner scanner = new Scanner(input);
        
        int n = Integer.parseInt(scanner.nextLine().trim());
        LibraryItem[] items = new LibraryItem[n];
        
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            int firstSpace = line.indexOf(' ');
            String type = line.substring(0, firstSpace);
            String title = line.substring(firstSpace + 2, line.length() - 1);
            
            if (type.equals("BOOK")) {
                items[i] = new Book(title);
            } else if (type.equals("DVD")) {
                items[i] = new DVD(title);
            } else {
                items[i] = new Magazine(title);
            }
        }
        
        LocalDate currentDate = LocalDate.of(2023, 10, 26);
        for (LibraryItem item : items) {
            System.out.println(item.getTitle() + ": " + currentDate.plusDays(item.getBorrowingPeriod()));
        }
    }
}
