// Lab Sheet 2 - Q8: Check whether three angles form a valid triangle
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class ValidTriangleAnglesProgram {
    void run(Scanner sc) {
        System.out.print("Enter three angles: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0 && (a + b + c) == 180)
            System.out.println("Valid triangle");
        else
            System.out.println("Not a valid triangle");
    }
}

public class Q08_ValidTriangleAngles {
    public static void main(String[] args) {
        ValidTriangleAnglesProgram program = new ValidTriangleAnglesProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
