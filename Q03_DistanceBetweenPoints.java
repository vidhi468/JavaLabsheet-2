// Lab Sheet 2 - Q3: Distance between two points in a 2D plane
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class DistanceBetweenPointsProgram {
    void run(Scanner sc) {
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Distance = " + d);
    }
}

public class Q03_DistanceBetweenPoints {
    public static void main(String[] args) {
        DistanceBetweenPointsProgram program = new DistanceBetweenPointsProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
