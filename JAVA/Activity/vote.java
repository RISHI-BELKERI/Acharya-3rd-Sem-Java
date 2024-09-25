import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        // int b = 17;
        System.out.print("Enter your age: ");
        a = sc.nextInt();

        if (a >= 18) {
            System.out.print("Person is eligible to vote");
        } 
        
        else {
            System.out.print("Person is not eligible to vote");
        }

    }
}


// course code

// import java.util.*;


// public class Solutions {
//    public static boolean isElligible(int age) {
//        if(age > 18) {
//            return true;
//        }
//        return false;
//    }
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int age = sc.nextInt();
//       System.out.println(isElligible(age));
//    }   
// }