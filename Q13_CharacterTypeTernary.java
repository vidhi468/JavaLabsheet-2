// Lab Sheet 2 - Q13: Vowel, consonant, digit or special symbol using the ternary operator
// Name: Shanu Sharma | MCA III Semester
import java.util.Scanner;

// Class that holds the logic of this question
class CharacterTypeTernaryProgram {
    void run(Scanner sc) {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        char lower = Character.toLowerCase(ch);
        String type = Character.isDigit(ch) ? "Digit"
                : Character.isLetter(ch)
                        ? ((lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
                                ? "Vowel" : "Consonant")
                        : "Special symbol";
        System.out.println("'" + ch + "' is a " + type);
    }
}

public class Q13_CharacterTypeTernary {
    public static void main(String[] args) {
        CharacterTypeTernaryProgram program = new CharacterTypeTernaryProgram(); // create an object of the class
        Scanner sc = new Scanner(System.in);
        program.run(sc);
        sc.close();
    }
}
