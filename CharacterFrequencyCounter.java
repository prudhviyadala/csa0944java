import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        Map<Character, Integer> frequencyMap = countCharacterFrequencies(input);
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scanner.close();
    }
    public static Map<Character, Integer> countCharacterFrequencies(String input) {
        Map<Character, Integer> frequencyMap = new TreeMap<>();
        for (char ch : input.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }
        return frequencyMap;
    }
}
