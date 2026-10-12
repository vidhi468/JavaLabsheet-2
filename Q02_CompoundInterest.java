// Lab Sheet 2 - Q2: Compound interest from principal, rate and time
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class CompoundInterestProgram {
    void run(Scanner sc) {
        System.out.print("Enter principal, rate (%) and time (years): ");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double amount = p * Math.pow(1 + r / 100, t);
        double ci = amount - p;
        System.out.println("Amount            = " + amount);
        System.out.println("Compound Interest = " + ci);
    }
}

public class Q02_CompoundInterest {
    public static void main(String[] args) {
        CompoundInterestProgram program = new CompoundInterestProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
