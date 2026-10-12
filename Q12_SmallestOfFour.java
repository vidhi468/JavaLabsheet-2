// Lab Sheet 2 - Q12: Smallest of four numbers using nested ternary operators
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class SmallestOfFourProgram {
    void run(Scanner sc) {
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int smallest = (a < b)
                ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d))
                : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));
        System.out.println("Smallest number = " + smallest);
    }
}

public class Q12_SmallestOfFour {
    public static void main(String[] args) {
        SmallestOfFourProgram program = new SmallestOfFourProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
