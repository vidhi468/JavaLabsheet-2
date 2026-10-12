// Lab Sheet 2 - Q27: Qualitative meaning of a grade using switch-case
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class GradeMeaningProgram {
    void run(Scanner sc) {
        System.out.print("Enter grade (A-F): ");
        char grade = Character.toUpperCase(sc.next().charAt(0));
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'E':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}

public class Q27_GradeMeaning {
    public static void main(String[] args) {
        GradeMeaningProgram program = new GradeMeaningProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
