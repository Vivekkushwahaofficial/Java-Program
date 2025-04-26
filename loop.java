// public class loops { 
//         public static void main(String args[]) {
//             int number = 0;
//             while(number<10) {
//                 System.out.println("Vivek Kumar");
//                 number++;
//         }
//         System.out.println("Hello world");
//     }
// }  
// PRINT 1 TO 10 IN JAVA     
//   public class loops {
//     public static void main(String args[]) {
//         int number = 1;
//         while(number<=10) {
//             System.out.println(number);
//             number++;
//         }
//     }
//   }   

// import java.util.*;

// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int range = sc.nextInt();
//         int counter = 1;

//         while(counter <= range) {
//             System.out.print(counter+" ");
//             counter++;
//         }     
//     }
// }

// PRINT SUM OF FIRST N NATURAL NUMBERS

// import java.util.*;

// public class loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         int i = 1;
//                 while(i <= n) {
//             sum += i;
//             i++;
//         }
//     }
// }

//FOR LOOP
// public class loop {
//     public static void main(String[] args) {

//         for(int i=1; i<=10;i++){
//         System.out.println("Hello World");
//         }
//     }
// }

// public class loop {
//     public static void main (String args[]) {
//         for(int i=1; i<=4; i++) {
//             System.out.println("* * * *");
//         }
//     }
// }

// import java.util.*;

// public class loop {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//             while(num > 0) {
//             int lastDigit = num % 10;
//             System.out.print(lastDigit);
//             num = num / 10;   
//         }
//     }
// }

// public class loop {
//     public static void main(String args[]) {
//         int n = 10889;
//         int rev = 0;
//         while(n > 0) {
//             int lastDigit = n % 10;
//             rev = (rev*10) + lastDigit;
//             n = n/10;
//         }
//         System.out.println(rev);
//     }
// }

// import java.util.*;
// public class loop {
//     public static void main(String args[]) {
//         int counter = 1;
//         do {    
//         System.out.println("Hello World");
//         counter++;
//         }
//         while(counter <= 10);
//     }
// }

// Break Statement
// public class loop {
//     public static void main(String args[]) {
//         for(int i = 1; i<=5; i++) {
//             if(i == 3) {
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("i am out of the loop");
//     }
// }

// Keep entering till user enters a multiple of 10

// import java.util.*;

// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         do {
//             int n = sc.nextInt();
//             if(n%10 == 0){
//                 break;
//         }
//             System.out.println(n);
//         } while(true);
//     }
// }
// Contimue Statement -> to skip an iteration.
// import java.util.*;

// public class loop {
//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++) {
//             if(i == 3) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

// Display all number entered by user except multiple of 10
// import java.util.*;

// public class loop {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        do {
//         System.out.print("enter tour number : ");
//         int n = sc.nextInt();
//         if(n % 10 == 0) {
//             continue;
//         }
//         System.out.println("number was : " + n);
//        }while(true); 
//     }
// }

// Check if a number is prime or not

import java.util.*;

public class loop {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2; i<=n-1; i++) {
            if(n % i == 0) {
                isPrime = false;
            }
        }
        if(isPrime == true) {
            System.out.println("n is prime");
        } else {
            System.out.print("n is not prime");
        }
        sc.close();
    }
}


   