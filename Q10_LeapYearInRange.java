// Lab Sheet 2 - Q10: Leap year and within a given range
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class LeapYearInRangeProgram {
    void run(Scanner sc) {
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.print("Enter range start year and end year: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        boolean inRange = year >= start && year <= end;
        if (leap && inRange)
            System.out.println(year + " is a leap year and within the range");
        else if (leap)
            System.out.println(year + " is a leap year but outside the range");
        else if (inRange)
            System.out.println(year + " is within the range but not a leap year");
        else
            System.out.println(year + " is neither a leap year nor within the range");
    }
}

public class Q10_LeapYearInRange {
    public static void main(String[] args) {
        LeapYearInRangeProgram program = new LeapYearInRangeProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
