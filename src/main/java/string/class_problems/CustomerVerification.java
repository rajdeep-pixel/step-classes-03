package string.class_problems;

public class CustomerVerification {
    public static void main(String[] args) {
        System.out.println(reverseCustomerName("Sunil"));
    }

    public static String reverseCustomerName(String customerName) {
        char[] chars = customerName.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) reversed += chars[i];
        return reversed;
    }
}