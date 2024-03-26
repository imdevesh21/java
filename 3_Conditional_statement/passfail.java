
import java.util.*;

public class passfail {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the marks");

        int score = sc.nextInt();

        char grade = calculategrade(score);

        System.out.println("The student grade is " + grade);

        sc.close();
    }

    public static char calculategrade(int score) {

        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'f';
        }

        return grade;

    }
}
