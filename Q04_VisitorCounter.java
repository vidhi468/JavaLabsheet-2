// Lab Sheet 2 - Q4: Prefix and postfix increment/decrement using a visitor counter
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class VisitorCounterProgram {
    void run(Scanner sc) {
        int visitors = 0;
        int choice;
        do {
            System.out.println("\n1. Visitor enters (postfix  visitors++)");
            System.out.println("2. Visitor enters (prefix   ++visitors)");
            System.out.println("3. Visitor leaves (postfix  visitors--)");
            System.out.println("4. Visitor leaves (prefix   --visitors)");
            System.out.println("0. Close store");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                int before = visitors++;       // postfix: old value is used first, then it increases
                System.out.println("Value before = " + before + ", now inside = " + visitors);
            } else if (choice == 2) {
                int after = ++visitors;        // prefix: it increases first, then the new value is used
                System.out.println("Value after  = " + after + ", now inside = " + visitors);
            } else if (choice == 3) {
                if (visitors > 0) {
                    int before = visitors--;
                    System.out.println("Value before = " + before + ", now inside = " + visitors);
                } else {
                    System.out.println("Store is already empty.");
                }
            } else if (choice == 4) {
                if (visitors > 0) {
                    int after = --visitors;
                    System.out.println("Value after  = " + after + ", now inside = " + visitors);
                } else {
                    System.out.println("Store is already empty.");
                }
            }
        } while (choice != 0);
        System.out.println("Visitors still inside at closing: " + visitors);
    }
}

public class Q04_VisitorCounter {
    public static void main(String[] args) {
        VisitorCounterProgram program = new VisitorCounterProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
