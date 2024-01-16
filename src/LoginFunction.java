
import java.util.Arrays;

public class LoginFunction {

    public static void login(int noOfDigitForThePalindrome, String userId, String password) {

        if (noOfDigitForThePalindrome <= 0) {
            System.out.println("Invalid input: Number of digits for palindrome must be a positive integer.");
            return;
        }

        if (!userId.matches("^\\w+$") || !password.matches("^\\w+$")) {
            System.out.println("Invalid input: User ID and password must contain only alphanumeric characters.");
            return;
        }


        String[][] validCredentials = {
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"user3", "pass3"},
                {"user4", "pass4"},
                {"user5", "pass5"}
        };

        if (Arrays.stream(validCredentials).anyMatch(arr -> arr[0].equals(userId) && arr[1].equals(password))) {

            int palindromeNumber = 1;
            while (String.valueOf(palindromeNumber).length() != noOfDigitForThePalindrome || !isPalindrome(palindromeNumber)) {
                palindromeNumber++;
            }

            String token = "token-" + palindromeNumber;


            System.out.println("Welcome " + userId + " and the generated token is: " + token);
        } else {
            System.out.println("Userld or password is not valid, pls try again.");
        }
    }


    public static boolean isPalindrome(int number) {
        String original = String.valueOf(number);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        // Example usage
        login(3, "user1", "pass1");
    }
}

