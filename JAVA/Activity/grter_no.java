import java.util.Scanner;

public class grter_no {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the number a: ");
        a = sc.nextInt();

        System.out.print("Enter the number b: ");
        b = sc.nextInt();

        if (a > b) {
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}