// Lab Sheet 2 - Q16: Multiply and divide by powers of two using shift operators
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class ShiftMultiplyDivideProgram {
    void run(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter power of two (k, for 2^k): ");
        int k = sc.nextInt();
        System.out.println(n + " * 2^" + k + " = " + (n << k) + "   (n << k)");
        System.out.println(n + " / 2^" + k + " = " + (n >> k) + "   (n >> k)");
    }
}

public class Q16_ShiftMultiplyDivide {
    public static void main(String[] args) {
        ShiftMultiplyDivideProgram program = new ShiftMultiplyDivideProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
