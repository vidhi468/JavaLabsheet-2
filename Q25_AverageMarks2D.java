// Lab Sheet 2 - Q25: Average marks of students in a 2D array using for-each loops
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class AverageMarks2DProgram {
    void run(Scanner sc) {
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();
        double[][] marks = new double[students][subjects];
        for (int i = 0; i < students; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            for (int j = 0; j < subjects; j++)
                marks[i][j] = sc.nextDouble();
        }
        int studentNo = 1;
        double grandTotal = 0;
        for (double[] row : marks) {           // outer for-each: one student (row) at a time
            double sum = 0;
            for (double m : row)               // inner for-each: each subject mark
                sum += m;
            grandTotal += sum;
            System.out.println("Student " + studentNo + " average = " + (sum / subjects));
            studentNo++;
        }
        System.out.println("Overall class average = " + (grandTotal / (students * subjects)));
    }
}

public class Q25_AverageMarks2D {
    public static void main(String[] args) {
        AverageMarks2DProgram program = new AverageMarks2DProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
