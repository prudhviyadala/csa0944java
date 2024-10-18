import java.util.Scanner;
public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        int vowelsCount = 0, consonantsCount = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { 
                if ("aeiou".indexOf(ch) != -1) {
                    vowelsCount++; 
                } else {
                    consonantsCount++; 
                }
            }
        }
        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consonants: " + consonantsCount);
    }
}
