package string.class_problems;

import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] options = {"Rock", "Paper", "Scissors"};
        Random rand = new Random();
        int wins = 0, losses = 0, draws = 0;
        
        for (int i = 0; i < 5; i++) {
            String p = options[i % 3]; 
            String c = options[rand.nextInt(3)];
            String result = playRound(p, c);
            
            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
            
            System.out.printf("%s vs %s: %s\n", p, c, result);
        }
        System.out.printf("W: %d | L: %d | D: %d | Win: %.1f%%\n", wins, losses, draws, (wins / 5.0) * 100);
    }

    public static String playRound(String p, String c) {
        if (p.equals(c)) return "Draw";
        if ((p.equals("Rock") && c.equals("Scissors")) ||
            (p.equals("Paper") && c.equals("Rock")) ||
            (p.equals("Scissors") && c.equals("Paper"))) return "Player Wins";
        return "Computer Wins";
    }
}