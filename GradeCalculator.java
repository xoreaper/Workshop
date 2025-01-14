package Workshop8;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String studentName;
        double grade;

        System.out.print("Enter student's name: ");
        studentName = scanner.nextLine();
        
        System.out.print("Enter grade for " + studentName + ": ");
        grade = scanner.nextDouble();

        if (grade >= 40) {
            System.out.println(studentName + " has passed with a grade of " + grade);
        } else {
            System.out.println(studentName + " has failed with a grade of " + grade);
        }
        
        scanner.close();
    }
}

