import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n, sum = 0;
        System.out.println("Enter a value of N (>=1): ");
        
        // Ensure the input is an integer
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer value (>=1): ");
            input.next(); // Clear the invalid input
        }
        
        n = input.nextInt();
        
        // Check if the input is valid (N >= 1)
        if (n < 1) {
            System.out.println("Invalid input. N should be greater than or equal to 1.");
            return;
        }
        
        System.out.println("N\t1+2+3+4+........+N");
        System.out.println("--------------------------------");
        
        for (i = 1; i <= n; i++) {
            sum = sum + i;
            System.out.println(i + "\t\t" + sum);
        }
        
        input.close();  // Close the Scanner
    }
}
