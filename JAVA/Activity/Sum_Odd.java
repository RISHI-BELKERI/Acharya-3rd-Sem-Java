import java.util.Scanner;

public class Sum_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the no of terms: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) 
            if ((i%2)!=0)
            sum = sum + i;
            System.out.println("The sum of all odd number from 1 to "+n+ " is "+sum);
    }
}