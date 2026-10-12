// Lab Sheet 2 - Q11: Pass if (theory >= 40 AND practical >= 50) OR overall >= 50
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class PassCourseProgram {
    void run(Scanner sc) {
        System.out.print("Enter theory marks (out of 100): ");
        double theory = sc.nextDouble();
        System.out.print("Enter practical marks (out of 100): ");
        double practical = sc.nextDouble();
        double overall = (theory + practical) / 2;
        System.out.println("Overall percentage = " + overall + "%");
        if ((theory >= 40 && practical >= 50) || overall >= 50)   // && is evaluated before ||
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }
}

public class Q11_PassCourse {
    public static void main(String[] args) {
        PassCourseProgram program = new PassCourseProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
