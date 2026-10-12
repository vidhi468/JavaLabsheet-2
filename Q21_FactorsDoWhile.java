// Lab Sheet 2 - Q21: Display all factors of a number using a do-while loop
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class FactorsDoWhileProgram {
    void run(Scanner sc) {
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        int i = 1;
        System.out.print("Factors of " + n + ": ");
        do {
            if (n % i == 0)
                System.out.print(i + " ");
            i++;
        } while (i <= n);
        System.out.println();
    }
}

public class Q21_FactorsDoWhile {
    public static void main(String[] args) {
        FactorsDoWhileProgram program = new FactorsDoWhileProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
