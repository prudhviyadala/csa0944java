public class ReverseWord {
    public static void main(String[] args) {
        String word = "hello";
        char[] chars = word.toCharArray();  
        String reversedWord = "";
        for (int i = 0; i < chars.length; i++) {
            reversedWord = chars[i] + reversedWord;
        }
        System.out.println("Original: " + word);
        System.out.println("Reversed: " + reversedWord);
    }
}
