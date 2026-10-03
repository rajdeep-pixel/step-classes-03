package polymorphism.class_problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Question {
    protected String text;
    protected String correctAnswer;
    protected String studentAnswer;
    protected int points;

    public Question(String text, String correctAnswer, String studentAnswer, int points) {
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.points = points;
    }

    public abstract double evaluate();
    public abstract String getType();
}

class MCQQuestion extends Question {
    public MCQQuestion(String text, String correctAnswer, String studentAnswer, int points) {
        super(text, correctAnswer, studentAnswer, points);
    }
    public double evaluate() {
        return studentAnswer.equals(correctAnswer) ? points : 0;
    }
    public String getType() { return "MCQ"; }
}

class TFQuestion extends Question {
    public TFQuestion(String text, String correctAnswer, String studentAnswer, int points) {
        super(text, correctAnswer, studentAnswer, points);
    }
    public double evaluate() {
        return studentAnswer.equals(correctAnswer) ? points : 0;
    }
    public String getType() { return "TF"; }
}

class EssayQuestion extends Question {
    public EssayQuestion(String text, String correctAnswer, String studentAnswer, int points) {
        super(text, correctAnswer, studentAnswer, points);
    }
    public double evaluate() {
        String[] keywords = correctAnswer.split(",");
        int matchCount = 0;
        String lowerStudentAnswer = studentAnswer.toLowerCase();
        
        for (String kw : keywords) {
            if (lowerStudentAnswer.contains(kw.trim().toLowerCase())) {
                matchCount++;
            }
        }
        
        if (matchCount >= 2) {
            return points * 0.75;
        } else if (matchCount == 1) {
            return points * 0.50;
        }
        return 0;
    }
    public String getType() { return "ESSAY"; }
}

public class ExaminationQuestionGrader {
    public static void main(String[] args) {
        String input = "4\n" +
                "MCQ \"What is the capital of France?\" \"Paris\" \"Paris\" 10\n" +
                "TF \"The Earth is flat?\" \"False\" \"True\" 5\n" +
                "ESSAY \"Name two primary OOP principles.\" \"Inheritance, Polymorphism, Encapsulation\" \"Polymorphism is one.\" 20\n" +
                "ESSAY \"Describe abstraction and composition.\" \"Abstraction, Composition\" \"I talked about abstraction.\" 15\n";
        
        Scanner scanner = new Scanner(input);
        int n = Integer.parseInt(scanner.nextLine().trim());
        Question[] questions = new Question[n];
        
        Pattern pattern = Pattern.compile("^(\\w+)\\s+\"([^\"]+)\"\\s+\"([^\"]+)\"\\s+\"([^\"]+)\"\\s+(\\d+)$");
        
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            Matcher m = pattern.matcher(line);
            if (m.find()) {
                String type = m.group(1);
                String text = m.group(2);
                String correct = m.group(3);
                String student = m.group(4);
                int points = Integer.parseInt(m.group(5));
                
                if (type.equals("MCQ")) {
                    questions[i] = new MCQQuestion(text, correct, student, points);
                } else if (type.equals("TF")) {
                    questions[i] = new TFQuestion(text, correct, student, points);
                } else {
                    questions[i] = new EssayQuestion(text, correct, student, points);
                }
            }
        }
        
        double total = 0;
        for (Question q : questions) {
            double score = q.evaluate();
            System.out.printf("%s: %.2f\n", q.getType(), score);
            total += score;
        }
        System.out.printf("\nTotal Score: %.2f\n", total);
    }
}
