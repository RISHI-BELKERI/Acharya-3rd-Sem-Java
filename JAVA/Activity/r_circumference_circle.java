import java.util.Scanner;

public class r_circumference_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        float pi = 3.14f; 
        System.out.print("Enter the radius ");
        r=sc.nextInt();
        System.out.print("Circumference of a is r="+ ((2*pi*r)));

    }
}

// course code

// import java.util.*;


// public class Solutions {
//    public static Double getCircumference(Double radius) {
//        return 2 * 3.14 * radius;
//    }
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       Double r = sc.nextDouble();
//       System.out.println(getCircumference(radius));
//    }   
// }
