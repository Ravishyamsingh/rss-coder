import java.util.Scanner;

public class input_until_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0, num;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            
            num = sc.nextInt();
            if (num == 0) break;
            
            sum += num;
        }

        sc.close();
        System.out.println("Sum of all numbers: " + sum);
    }
}
