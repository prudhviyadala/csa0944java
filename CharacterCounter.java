import java.util.Scanner;
public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uppercaseCount = 0, lowercaseCount = 0, digitCount = 0;
        char ch;
        System.out.println("Enter characters (type '*' to stop): ");
        while (true) {
            ch = scanner.next().charAt(0);
            if (ch == '*') break;
            if (ch >= 'A' && ch <= 'Z') {
                uppercaseCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowercaseCount++;
            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
        }
        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Lowercase letters: " + lowercaseCount);
        System.out.println("Numbers: " + digitCount);
        scanner.close();
    }
}
