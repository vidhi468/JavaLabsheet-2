// Lab Sheet 2 - Q9: Compare two strings lexicographically without built-in compare functions
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class StringLexicographicProgram {
    void run(Scanner sc) {
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        int len = s1.length() < s2.length() ? s1.length() : s2.length();
        int result = 0;                        // 0 equal, -1 first smaller, 1 first greater
        for (int i = 0; i < len; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 < c2) {                     // relational operators on characters
                result = -1;
                break;
            } else if (c1 > c2) {
                result = 1;
                break;
            }
        }
        if (result == 0) {                     // all common characters match: shorter string comes first
            if (s1.length() < s2.length())
                result = -1;
            else if (s1.length() > s2.length())
                result = 1;
        }
        if (result < 0)
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
        else if (result > 0)
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\"");
        else
            System.out.println("Both strings are equal");
    }
}

public class Q09_StringLexicographic {
    public static void main(String[] args) {
        StringLexicographicProgram program = new StringLexicographicProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
