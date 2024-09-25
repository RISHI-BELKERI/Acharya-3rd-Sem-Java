import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first integer:");
            int a = sc.nextInt();
            System.out.print("Enter the second integer:");
            int b = sc.nextInt();
            System.out.print("avg of 2 no's is:" + (a + b / 2));
        }
    }
}