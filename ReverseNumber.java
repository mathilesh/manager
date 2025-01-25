import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;  
            reversedNumber = reversedNumber * 10 + digit;  
            number /= 10;  
        }

        // Display the reversed number
        System.out.println("Reversed number: " + reversedNumber);
        
        // Close the scanner
        scanner.close();
    }
}
