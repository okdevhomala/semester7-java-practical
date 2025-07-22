import java.lang.*;
import java.util.Scanner;

public class ArraySort // Name this ArraySort
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        System.out.println("Aayush Chandra Pradhan");
		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int[] numbers = new int[n];

		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++)
	{ 
            numbers[i] = scanner.nextInt();	
	}

// Bubble sort 
     for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        scanner.close();
	}
}