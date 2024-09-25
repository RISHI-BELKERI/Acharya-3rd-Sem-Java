// import java.util.Scanner;

// public class user_enter {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x;
//         int positiveCounts = 0, negativeCounts = 0, zeros = 0;

//         System.out.print("How many numbers you want to enter :");
//         x = sc.nextInt();

//         for (int i = 1; i <= x; i++) {
//             System.out.println("Enter the types of numbers: ");
//             x = sc.nextInt();
//             if (x > 0) {
//                 positiveCounts++;
//             }
//             if (x < 0) {
//                 negativeCounts++;
//             }
//             if (x == 0) {
//                 zeros++;
//             }
//         }
//         System.out.println("Number of positive integers are: " + positiveCounts);
//         System.out.println("Number of negative integers are: " + negativeCounts);
//         System.out.println("Number of zeros are: " + zeros);
//     }
// }

import java.util.Scanner;

public class user_enter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int positiveCounts = 0, negativeCounts = 0, zeros = 0;
        
        System.out.print("How many numbers do you want to enter: ");
        x = sc.nextInt();
        
        for (int i = 1; i <= x; i++) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt(); // Use a different variable to read the numbers
            
            if (num > 0) {
                positiveCounts++;
            } else if (num < 0) {
                negativeCounts++;
            } else {
                zeros++;
            }
        }
        
        System.out.println("Number of positive integers: " + positiveCounts);
        System.out.println("Number of negative integers: " + negativeCounts);
        System.out.println("Number of zeros: " + zeros);
    }
}


/*  7th :- Write a program to enter the numbers 
till user wants and at the end it should display the count of 
positive, negative and zeros entered */