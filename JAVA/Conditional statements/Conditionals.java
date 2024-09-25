// import java.util.*;

// public class Conditionals {

/*
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * // int age = sc.nextInt(); // Age
 * // int x = sc.nextInt(); // odd or even
 * int a = sc.nextInt(); // a greater than less than
 * int b = sc.nextInt(); // a greater than less than
 * 
 * 
 * // Age
 * // if (age > 18) {
 * // System.out.println("Adult");
 * // } else {
 * // System.out.println("Not Adult");
 * // }
 * 
 * // odd or even
 * // if (x % 2 == 0) {
 * // System.out.println("even");
 * // } else {
 * // System.out.println("odd");
 * // }
 * 
 * // a>b, a<b, a=b;
 * 
 * if (a < b) {
 * System.out.println("a is less than b");
 * } else if (a > b) {
 * System.out.println("a is greater than b");
 * // else {
 * // if (a > b) {
 * // System.out.println("a is greater than b");
 * // }
 * } else {
 * System.out.println("a is equals to b");
 * }
 * }
 */

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int button = sc.nextInt();

// if(button == 1) {

// }
// }

// }

import java.util.*;

public class Conditionals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println("a is less than b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is equals to b");
        }
    }
}