public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        // int number = 1;
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
                // number++;
            }
            System.out.println();
        } 
    }
}          

/* o/p
 
1 2 3 4 5
1 2 3
1 2
1 
 */

// same output different code by apna clg

// public class pattern6 {
//     public static void main(String[] args) {
//         int n = 5;
//         // int number = 1;
//         for (int i = 1; i<=n; i++) {
//             for (int j = 1; j <=n; j++) {
//                 System.out.print(j+" ");
//                 // number++;
//             }
//             System.out.println();
//         } 
//     }
// }