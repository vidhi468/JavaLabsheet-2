// Lab Sheet 2 - Q28: Print 1 to 50 skipping perfect squares using continue
// Name: Shanu Sharma | MCA III Semester

// Class that holds the logic of this question
class SkipPerfectSquaresProgram {
    void run() {
        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);
            if (root * root == i)              // i is a perfect square
                continue;                      // skip the rest of this iteration
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class Q28_SkipPerfectSquares {
    public static void main(String[] args) {
        SkipPerfectSquaresProgram program = new SkipPerfectSquaresProgram(); // create an object of the class
        program.run();
    }
}
