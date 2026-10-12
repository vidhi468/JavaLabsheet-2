// Lab Sheet 2 - Q5: Negative value of an integer using the unary minus operator
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class NegativeValueProgram {
    void run(Scanner sc) {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int neg = -n;                          // unary minus
        System.out.println("Original = " + n);
        System.out.println("Negative = " + neg);
    }
}

public class Q05_NegativeValue {
    public static void main(String[] args) {
        NegativeValueProgram program = new NegativeValueProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
