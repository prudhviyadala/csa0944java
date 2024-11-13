public class StringReverser {
    public static void main(String[] args) {
        String original = "hello";
        char[] chars = original.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i]; 
        }
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }
}

