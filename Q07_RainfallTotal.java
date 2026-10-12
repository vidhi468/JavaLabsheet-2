// Lab Sheet 2 - Q7: Accumulate 7 days of rainfall using +=
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class RainfallTotalProgram {
    void run(Scanner sc) {
        double total = 0;
        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter rainfall (mm) for day " + day + ": ");
            total += sc.nextDouble();          // total = total + value
        }
        System.out.println("Total rainfall in 7 days = " + total + " mm");
    }
}

public class Q07_RainfallTotal {
    public static void main(String[] args) {
        RainfallTotalProgram program = new RainfallTotalProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
