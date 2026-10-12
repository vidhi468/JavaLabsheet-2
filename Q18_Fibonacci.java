// Lab Sheet 2 - Q18: First 20 Fibonacci terms using a for loop
// Name: Shanu Sharma | MCA III Semester

// Class that holds the logic of this question
class FibonacciProgram {
    void run() {
        long a = 0, b = 1;
        System.out.println("First 20 terms of Fibonacci series:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

public class Q18_Fibonacci {
    public static void main(String[] args) {
        FibonacciProgram program = new FibonacciProgram(); // create an object of the class
        program.run();
    }
}
