// Lab Sheet 2 - Q14: Swap two integers without a temporary variable using XOR
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class XorSwapProgram {
    void run(Scanner sc) {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;                             // now b holds the old a
        a = a ^ b;                             // now a holds the old b
        System.out.println("After swap : a = " + a + ", b = " + b);
    }
}

public class Q14_XorSwap {
    public static void main(String[] args) {
        XorSwapProgram program = new XorSwapProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
