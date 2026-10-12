// Lab Sheet 2 - Q19: Armstrong numbers between 1 and 1000 using a for loop
// Name: Shanu Sharma | MCA III Semester

// Class that holds the logic of this question
class ArmstrongRangeProgram {
    void run() {
        System.out.println("Armstrong numbers between 1 and 1000:");
        for (int n = 1; n <= 1000; n++) {
            int digits = String.valueOf(n).length();
            int temp = n, sum = 0;
            while (temp > 0) {
                sum += (int) Math.pow(temp % 10, digits);
                temp /= 10;
            }
            if (sum == n)
                System.out.print(n + " ");
        }
        System.out.println();
    }
}

public class Q19_ArmstrongRange {
    public static void main(String[] args) {
        ArmstrongRangeProgram program = new ArmstrongRangeProgram(); // create an object of the class
        program.run();
    }
}
