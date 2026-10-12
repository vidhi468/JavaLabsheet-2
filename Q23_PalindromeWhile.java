// Lab Sheet 2 - Q23: Palindrome check using a while loop
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class PalindromeWhileProgram {
    void run(Scanner sc) {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp = n;
        long rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (n >= 0 && rev == n)
            System.out.println(n + " is a Palindrome");
        else
            System.out.println(n + " is NOT a Palindrome");
    }
}

public class Q23_PalindromeWhile {
    public static void main(String[] args) {
        PalindromeWhileProgram program = new PalindromeWhileProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
