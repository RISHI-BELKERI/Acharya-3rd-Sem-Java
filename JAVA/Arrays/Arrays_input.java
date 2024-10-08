// package Arrays;
// import java.util.*;
// public class Arrays_input {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             System.out.println(numbers[i]);
//         }
//     }
// }

/*
 * So hear we didn't store any value and it is in int value,
 * so it will store 0 for int,
 * if it's float it will store 0.0,
 * if it's boolean it will store false
 * if it's string it stores " "
 */

// package Arrays;

import java.util.*;

public class Arrays_input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index : " + i);
            }
        }
    }
}