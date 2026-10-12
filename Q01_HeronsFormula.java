// Lab Sheet 2 - Q1: Area of a triangle using Heron's formula
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class HeronsFormulaProgram {
    void run(Scanner sc) {
        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b > c && b + c > a && a + c > b) {
            double s = (a + b + c) / 2;        // semi-perimeter
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of triangle = " + area);
        } else {
            System.out.println("These sides cannot form a triangle.");
        }
    }
}

public class Q01_HeronsFormula {
    public static void main(String[] args) {
        HeronsFormulaProgram program = new HeronsFormulaProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
