// Lab Sheet 2 - Q17: Cyclically rotate the bits of an integer left by 2 positions
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class RotateBitsLeftProgram {
    void run(Scanner sc) {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int rotated = (n << 2) | (n >>> 30);   // the two bits pushed out on the left come back on the right
        System.out.println("Original : " + String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0')
                + " (" + n + ")");
        System.out.println("Rotated  : " + String.format("%32s", Integer.toBinaryString(rotated)).replace(' ', '0')
                + " (" + rotated + ")");
    }
}

public class Q17_RotateBitsLeft {
    public static void main(String[] args) {
        RotateBitsLeftProgram program = new RotateBitsLeftProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
