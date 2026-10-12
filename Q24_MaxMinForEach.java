// Lab Sheet 2 - Q24: Maximum and minimum of an array using a for-each loop
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class MaxMinForEachProgram {
    void run(Scanner sc) {
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        int max = arr[0], min = arr[0];
        for (int x : arr) {                    // for-each loop
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}

public class Q24_MaxMinForEach {
    public static void main(String[] args) {
        MaxMinForEachProgram program = new MaxMinForEachProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
