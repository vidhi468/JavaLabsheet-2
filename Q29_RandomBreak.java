// Lab Sheet 2 - Q29: Random numbers until one divisible by both 7 and 13 (break)
// Name: Shanu Sharma | MCA III Semester
import java.util.Random;

// Class that holds the logic of this question
class RandomBreakProgram {
    void run() {
        Random rand = new Random();
        int attempts = 0;
        while (true) {
            int num = rand.nextInt(100) + 1;   // random number from 1 to 100
            attempts++;
            System.out.print(num + " ");
            if (num % 7 == 0 && num % 13 == 0) {
                System.out.println("\nFound " + num + " (divisible by 7 and 13) after " + attempts + " attempts");
                break;                         // leave the loop
            }
        }
    }
}

public class Q29_RandomBreak {
    public static void main(String[] args) {
        RandomBreakProgram program = new RandomBreakProgram(); // create an object of the class
        program.run();
    }
}
