// Lab Sheet 2 - Q20: Accept a password until the correct one is entered (do-while)
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class PasswordDoWhileProgram {
    void run(Scanner sc) {
        final String PASSWORD = "java123";
        String input;
        do {                                   // runs at least once
            System.out.print("Enter password: ");
            input = sc.next();
            if (!input.equals(PASSWORD))
                System.out.println("Wrong password, try again.");
        } while (!input.equals(PASSWORD));
        System.out.println("Access granted!");
        System.out.println("(Hint: the password set in this program is " + PASSWORD + ")");
    }
}

public class Q20_PasswordDoWhile {
    public static void main(String[] args) {
        PasswordDoWhileProgram program = new PasswordDoWhileProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
