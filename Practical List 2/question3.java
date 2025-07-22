import java.util.Scanner;

// Custom exception class
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class question3 { // CustomExceptionDemo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Khusboo Karki");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new MyException("Age must be 18 or above");
            } else {
                System.out.println("You are eligible.");
            }
        } catch (MyException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        sc.close();
    }
}
