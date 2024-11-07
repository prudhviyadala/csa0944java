
import java.util.Arrays;
import java.util.Scanner;
public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        if (areAnagramsUsingSorting(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams (Using Sorting Approach).");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams (Using Sorting Approach).");
        }
        if (areAnagramsUsingFrequency(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams (Using Frequency Counting Approach).");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams (Using Frequency Counting Approach).");
        }
        scanner.close();
    }
    public static boolean areAnagramsUsingSorting(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static boolean areAnagramsUsingFrequency(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] frequency = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i) - 'a']++;
            frequency[str2.charAt(i) - 'a']--;
        }
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
