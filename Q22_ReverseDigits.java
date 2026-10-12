// Lab Sheet 2 - Q22: Reverse the digits of an integer using a while loop
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class ReverseDigitsProgram {
    void run(Scanner sc) {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        long rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (n < 0)
            rev = -rev;
        System.out.println("Reversed number = " + rev);
    }
}

public class Q22_ReverseDigits {
    public static void main(String[] args) {
        ReverseDigitsProgram program = new ReverseDigitsProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
