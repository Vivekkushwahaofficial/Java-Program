// public class Functions {
//     public static void printHelloworld() {
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//     }
//     public static void main(String args[]) {
//          printHelloworld();
//     }
// }
// import java.util.*;
// public class Functions {
//     public static void printHelloworld() {
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//     }
//     public static void calculateSum() {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("sum is : " + sum);
//     }
//     public static void main(String args[]) {
//         calculateSum();
//     }
// }

// import java.util.*;
// public class Functions {
//        public static void calculateSum(int num1, int num2) {
//         int sum = num1 + num2;
//         System.out.println("sum is : " + sum);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         calculateSum(a, b);
//     }
// }

// import java.util.*;
// public class Functions {
//        public static int calculateSum(int num1, int num2) {
//         int sum = num1 + num2;
//         return sum;
//        }
//     public static void main(String args[] ) {
//             Scanner sc = new Scanner(System.in);
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int sum = calculateSum(a, b);
//             System.out.println("a + b : " + sum);
//     }
// }

// find product of a & b.
// public class Functions {
// public static int multiply(int a, int b) {
//         int product = a * b;
//         return product;
//         }
//         public static void main(String args[]) {
//                 int prod = multiply(3, 5);
//                 System.out.println("Product is : " + prod);
//                 prod = multiply(10, 20);
//                 System.out.print("Product is : " + prod);
//         }
// }

// Factorial of number, n
//  public class Functions {
// public static int factorial(int n) {
//     int f = 1;
//     for(int i=1; i<=n; i++) {
//         f = f * i;
//     }
//     return f;
// }
//  public static void main(String args[]) {
//     System.out.println(factorial(4));
//  }
// }

// public class Functions {
//     public static int factorial(int num) {
//         int fact = 1;
//         for(int i = 1; i <= num; i++) {
//             fact *= i;
//         }
//         return fact;
//     }
//     public static int bincoeff(int n, int r) {
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);

//         int binCoeff = fact_n / (fact_r * fact_nmr);
//         return binCoeff;
//     }
//     public static void main(String args[]) {
//         System.out.println(bincoeff(5, 2));
//     }
// }

//  public class Functions {
//     public static int sum(int a, int b) {
//         return a+b;
//     }
//     public static float sum(float a, float b) {
//         return a+b;
//     }
//     public static void main(String args[]) {
//         System.out.println(sum(3, 5));
//         System.out.println(sum(3.22f, 4.8f));
//     }
//  }

// Check if Number is Prime or Not.
// public class Functions {
//     public static boolean isPrime;
//         public static boolean isPrime(int n) {
//             boolean isPrime = true;
//             for(int i=2; i<n-i; i++) {
//                 if(n % i == 0) {
//                      isPrime = false; 
//             }
//         }
//             return isPrime;
//         }
//         public static void main(String args[]) {
//             System.out.println(isPrime(6));
//         }
//     }


public class Functions {
    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;  
    }
    public static void main(String args[]) {
        System.out.println(isPrime(2));
    }
}
