package sept.ex_20092024;

public class Lab074 {
    public static void main(String[] args) {
        // grade calculator
        //write a programme that calculates and displays
        //the letter grade for a given numerical
        //score (e.g., A, B, C, D, or F)
        //based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        //90 -> A
        //87 -> B
        //23 -> F

        char grade = 'F';
        int score = 89;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';

        }
    }
}
