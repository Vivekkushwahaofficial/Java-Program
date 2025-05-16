// public class Patterns {
//     public static void hollow_rectangle(int totRows, int totCols) {
//         for(int i=1; i<=totRows; i++) {
//             for(int j=1; j<=totCols; j++) {
//                 if(i==1 || i == totRows || j == 1 || j == totCols) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         hollow_rectangle(4, 5);
//     }
// }

// Inverted half pyramid
// public class Patterns {
//     public static void half_pyramid(int n) {
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         half_pyramid(4);
//     }
// }

// half_pyramid
// public class Patterns {
//     public static void half_pyramid(int n) {
//         for(int i=1; i<=n; i++) {
//         for(int j=1; j<=n-i+1; j++) {
//             System.out.print(j+" ");
//         }
//         System.out.println();
//     }
// }
//     public static void main(String[] args) {
//         half_pyramid(4);
//     }
// }

// Floyd's Triangle Pattern
// public class Patterns {
//     public static void floyds_triangle(int n) {
//         int counter = 1;
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(counter+" ");
//                 counter++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         floyds_triangle(4);
//     }
// }

// Zero One Triangle Pattern
// public class Patterns {
//     public static void zero_one_triangle (int n) {
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 if((i+j) % 2 == 0) {
//                     System.out.print("1");
//                 } else {
//                     System.out.print("0");
//                 }
//             }
//                 System.out.println();
//             }
//         }
//     public static void main(String args[]) {
//         zero_one_triangle(5);
//     }
//  }

// BUTTERFLY Pattern
// public class Patterns {
//     public static void butterfly (int n) {
//         // 1st half
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//                 for(int j=1; j<=2*(n-i); j++) {
//                     System.out.print (" ");
//                 }
//                     for(int j=1; j<=i; j++) {
//                         System.out.print("*"); 
//                     }
//                      System.out.println();
//                     }
//         // 2nd half
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++) {
//                  System.out.print("*");
//                 }
//                 for(int j=1; j<=2*(n-i); j++) {
//                     System.out.print(" ");
//                 }
//                 for(int j=1; j<=i; j++) {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
//         public static void main(String[] args) {
//             butterfly(5);
//         }
//     }

// Solid Rhombus
// public class Patterns {
//     public static void solid_rhombus(int n) {
//         for(int i=1; i<=n; i++) {
//             for (int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=n; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         solid_rhombus(5);
//     }
// }

// Ḥollow Rhombus
// public class Patterns {
//     public static void hollow_rohmbus(int n) {
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=n; j++) {
//                 if(i==1 || i==n || j == 1 || j == n) {
//                 System.out.print("*");
//                     } else {
//                         System.out.print(" ");
//                     }
//                 }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         hollow_rohmbus(4);
//     }
// } 

// Diamond Problem
public class Patterns {
    public static void diamond(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        diamond(4);
    }
}









