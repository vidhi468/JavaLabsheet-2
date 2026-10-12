// Lab Sheet 2 - Q30: Power of 4 (shifts), toggle 3rd bit, table with continue and break
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class MixedAdvancedProgram {
    void run(Scanner sc) {
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        // (a) power of 4 using shift operators:
        // must be a power of 2, and the single set bit must be at an even position
        int temp = n;
        int shifts = 0;
        while (temp > 1) {
            temp >>= 1;
            shifts++;
        }
        boolean powerOfTwo = n > 0 && (n & (n - 1)) == 0;
        if (powerOfTwo && shifts % 2 == 0)
            System.out.println(n + " is a power of 4");
        else
            System.out.println(n + " is NOT a power of 4");

        // (b) toggle the 3rd bit (bit position 2, counting from the right, starting at 1)
        int toggled = n ^ (1 << 2);
        System.out.println("Before toggling 3rd bit : " + Integer.toBinaryString(n) + " (" + n + ")");
        System.out.println("After toggling 3rd bit  : " + Integer.toBinaryString(toggled) + " (" + toggled + ")");

        // (c) + (d) multiplication table of the toggled number (1 to 20)
        System.out.println("Multiplication table of " + toggled + ":");
        for (int i = 1; i <= 20; i++) {
            int product = toggled * i;
            if (product % 48 == 0 && product != 0) {   // checked first: every multiple of 48 is also a multiple of 6
                System.out.println("Reached multiple of 48 (" + product + "). Stopping.");
                break;
            }
            if (product % 6 == 0)
                continue;
            System.out.println(toggled + " x " + i + " = " + product);
        }
    }
}

public class Q30_MixedAdvanced {
    public static void main(String[] args) {
        MixedAdvancedProgram program = new MixedAdvancedProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
