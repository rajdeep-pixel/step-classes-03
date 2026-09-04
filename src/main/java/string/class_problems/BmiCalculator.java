package string.class_problems;

public class BmiCalculator {
    public static void main(String[] args) {
        double[] heights = {1.75, 1.60};
        double[] weights = {70.0, 90.0};
        printWellnessReport(heights, weights);
    }

    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 29.9) return "Overweight";
        return "Obese";
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            System.out.printf("BMI: %.2f | %s\n", bmi, getBmiStatus(bmi));
        }
    }
}