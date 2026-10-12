// Lab Sheet 2 - Q15: Count the set bits (1s) of a number using bitwise operators
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class CountSetBitsProgram {
    void run(Scanner sc) {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 0) {
            count += temp & 1;                 // check the last bit
            temp >>>= 1;                       // move to the next bit
        }
        System.out.println("Binary of " + n + " = " + Integer.toBinaryString(n));
        System.out.println("Number of set bits = " + count);
    }
}

public class Q15_CountSetBits {
    public static void main(String[] args) {
        CountSetBitsProgram program = new CountSetBitsProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
