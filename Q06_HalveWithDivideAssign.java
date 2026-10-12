// Lab Sheet 2 - Q6: Halve a number using /= until it is less than 1
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class HalveWithDivideAssignProgram {
    void run(Scanner sc) {
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        int steps = 0;
        while (n >= 1) {
            n /= 2;                            // n = n / 2
            steps++;
            System.out.println("Step " + steps + ": " + n);
        }
        System.out.println("Total steps = " + steps);
    }
}

public class Q06_HalveWithDivideAssign {
    public static void main(String[] args) {
        HalveWithDivideAssignProgram program = new HalveWithDivideAssignProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
