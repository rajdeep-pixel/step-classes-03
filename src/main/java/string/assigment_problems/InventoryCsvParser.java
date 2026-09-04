package string.assigment_problems;
import java.util.Scanner;
public class InventoryCsvParser {
    public static void parseInventoryRecord(String csvLine) {
        if (csvLine == null) {
            System.out.println("Invalid Record");
            return;
        }
        String[] fields = csvLine.split(",");
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }
        String product = fields[0].trim();
        String sku = fields[1].trim();
        String qty = fields[2].trim();

        System.out.printf("Product: %s | SKU: %s | Qty: %s%n", product, sku, qty);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter inventory CSV line: ");
        String csvLine = sc.nextLine();
        parseInventoryRecord(csvLine);
        sc.close();
    }
}
