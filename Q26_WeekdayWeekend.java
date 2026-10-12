// Lab Sheet 2 - Q26: Weekday or weekend using switch-case
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class WeekdayWeekendProgram {
    void run(Scanner sc) {
        System.out.print("Enter day number (1-7, 1 = Monday): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}

public class Q26_WeekdayWeekend {
    public static void main(String[] args) {
        WeekdayWeekendProgram program = new WeekdayWeekendProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
