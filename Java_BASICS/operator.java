
//Binary Arithmetic Operators 
// public class operators {
//    public static void main(String args[]) {
//     int A = 10;
//     int B = 5;
//     System.out.println("multiple = " + (A * B));
//    } 
// }
// Unary Arithmetic Operators
// public class operators {
//     public static void main(String args[]) {
//      int A = 10;
//      int B = ++A;
//      System.out.println(A);
//      System.out.println(B);
//     } 
//  }
// public class operators {
//         public static void main(String args[]) {
//          int A = 10;
//          int B = A++;
//          System.out.println(A);
//          System.out.println(B);
//         } 
//      }

// public class operators {
//     public static void main(String args[]) {
//      int A = 10;
//      int B = --A;
//      System.out.println(A);
//      System.out.println(B);
//     } 
//  }
// public class operators {
//         public static void main(String args[]) {
//          int A = 10;
//          int B = A--;
//          System.out.println(A);
//          System.out.println(B);
//         } 
//      }
// public class operators {
//         public static void main(String args[]) {
//          int A = 10;
//         int B = 5;
//         System.out.println(A < B);
//         System.out.println(A > B);
//         }
// }
// Logical AND operators
// public class operators {
//         public static void main(String args[]) {
//                 System.out.println( (3<2) && (5<0));
//                 System.out.println( (3>2) && (5>0));
//         }
// }
// Logical OR operators
// public class operators {
//         public static void main(String args[]) {
//                 System.out.println((3<4) || (3<6));
//                 System.out.println((4>3) || (2<1));
//                 System.out.println((4<2) || (2>3));
//         }
// }
// Logical NOT operator
// public class operators {
//         public static void main (String args[]) {
//                 System.out.println( !(3<4));
//                 System.out.println( !(4>5));

//         }
// }
// Assingment OPERATOR
// public class operators {
//         public static void main(String args[]) {
//                 int A = 10;
//                 // A = A + 12;
//                 A += 12;
//                 System.out.println(A);
//                 int B = 10;
//                 // B = B - 10;
//                 B -= 10;
//                 System.out.println(B);
//                 int C = 20;
//                 // C = C * 10;
//                 C *= 10;
//                 System.out.println(C);
//                 int D = 12;
//                 // D = D / 6;
//                 D /= 6;
//                 System.out.println(D);
//         }
// }

// public class operator {
//     public static void main (String args[]) {
//         int x = 2, y = 5;

//         int exp1 = (x * y / x);
//         int exp2 = (x * (y / x));

//         System.out.println(exp1 + " , ");
//         System.out.println(exp2);
//     }
// }

// public class operator {
//     public static void main(String args[]) {
//         int x = 2000, y = 50, z = 100;
//         if (x > y && y > z) {
//             System.out.println( "Hello");
//         }
//         if (z > y && z < x) {
//             System.out.println("Java");
//         }
//         if((y+200) < x && (y+150) < z){
//             System.out.println("Hello Java");
//         }

//     }
// }

// public class operator {
//     public static void main(String[] args) {
//         int x, y, z;
//         x = y = z = 2;
//         x += y;
//         y -= z;
//         z /= (x + y);
//         System.out.println(x + " " + y + " " + z);
//         }
// }

// public class operator {
//     public static void main (String args[]) {
//         int x = 9, y = 12;
//         int a = 2, b = 4, c = 6;

//         int exp = 4/3 * (x + 34) +9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);
//         System.out.println(exp);
//     }
// }

public class operator {
    public static void main(String[] args) {
        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}
