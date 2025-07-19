import java.util.Scanner;

// Step 1: User-defined exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class question6 { // rename to VotingSystem
    // Step 2: Method that throws the exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be at least 18 to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    // Step 3: Main method with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aayush Chandra Pradhan");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}
