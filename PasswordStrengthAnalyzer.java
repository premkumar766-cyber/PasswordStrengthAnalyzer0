import java.util.Scanner;

public class PasswordStrengthAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int score = 0;

        // Length check
        if (password.length() >= 8) {
            score++;
        }

        // Uppercase check
        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        // Lowercase check
        if (password.matches(".*[a-z].*")) {
            score++;
        }

        // Number check
        if (password.matches(".*[0-9].*")) {
            score++;
        }

        // Special character check
        if (password.matches(".*[!@#$%^&*()_+=-].*")) {
            score++;
        }

        System.out.println("\nPassword Analysis:");

        if (score <= 2) {
            System.out.println("Strength: Weak");
        } 
        else if (score == 3 || score == 4) {
            System.out.println("Strength: Medium");
        } 
        else {
            System.out.println("Strength: Strong");
        }


        System.out.println("\nSuggestions:");

        if (password.length() < 8) {
            System.out.println("- Use at least 8 characters");
        }

        if (!password.matches(".*[A-Z].*")) {
            System.out.println("- Add uppercase letters");
        }

        if (!password.matches(".*[a-z].*")) {
            System.out.println("- Add lowercase letters");
        }

        if (!password.matches(".*[0-9].*")) {
            System.out.println("- Add numbers");
        }

        if (!password.matches(".*[!@#$%^&*()_+=-].*")) {
            System.out.println("- Add special characters");
        }

        sc.close();
    }
}
