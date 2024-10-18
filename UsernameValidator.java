public class UsernameValidator {

    public static void validateUsername(String username) {
        if (username.matches("^[a-zA-Z0-9_]{5,15}$")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        String username = "user123";
        validateUsername(username);
    }
}
