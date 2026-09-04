package string.class_problems;

public class UniqueLetterHunt {
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingChar("swiss"));
    }

    public static char findFirstNonRepeatingChar(String text) {
        int[] counts = new int[256];
        for (char c : text.toCharArray()) counts[c]++;
        for (char c : text.toCharArray()) {
            if (counts[c] == 1) return c;
        }
        return '\0';
    }
}