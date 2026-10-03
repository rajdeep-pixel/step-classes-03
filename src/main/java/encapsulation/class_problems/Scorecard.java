package encapsulation.class_problems;

public class Scorecard {
    private final boolean[] results;
    private int currentIndex;

    public Scorecard(int totalQuestions) {
        results = new boolean[totalQuestions];
        currentIndex = 0;
    }

    public void recordAnswer(boolean isCorrect) {
        if (currentIndex < results.length) {
            results[currentIndex] = isCorrect;
            currentIndex++;
        }
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (results[i]) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);
        System.out.println(sc.getScore());
    }
}
