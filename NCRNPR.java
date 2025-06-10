


import java.util.Scanner;

public class NCRNPR {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        
        return fact;
    }
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter value of N: ");
        
        int n = scanner.nextInt();
        

        System.out.print("Enter value of R: ");
        int r = scanner.nextInt();

        if (r > n) {
            System.out.println("R should be less than or equal to N.");
        } else {
            int ncr = factorial(n) / (factorial(r) * factorial(n - r));
            int npr = factorial(n) / factorial(n - r);

            System.out.println("NCR (Combination): " + ncr);
            System.out.println("NPR (Permutation): " + npr);
        }

        scanner.close();
    }
}
