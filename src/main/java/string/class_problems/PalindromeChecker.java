package string.class_problems;

public class PalindromeChecker {
    public static void main(String[] args) {
        String text = "madam";
        System.out.println(isPalindromeIterative(text));
        System.out.println(isPalindromeRecursive(text));
        System.out.println(isPalindromeArrayReversal(text));
    }

    public static boolean isPalindromeIterative(String text) {
        for (int i = 0, j = text.length() - 1; i < j; i++, j--) {
            if (text.charAt(i) != text.charAt(j)) return false;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) return true;
        if (text.charAt(0) != text.charAt(text.length() - 1)) return false;
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] arr = text.toCharArray();
        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--) rev += arr[i];
        return text.equals(rev);
    }
}