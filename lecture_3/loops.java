package lecture_3;
// public class loops {
//     public static void main(String[] args){
//         for(int i = 1 ; i<=3 ; i++){
//             System.out.println("Aman");
//         }
//     }
// }

// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int i ;
//         for(i=1;i<=100;i++){
//             if(i%2 == 0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int i ;
//         for(i=17;i<=170;i=i+17){
//                 System.out.println(i);
//         }
//     }
// }

// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int i ;
//         for(i=3;i<=100;i=i+6){

//             // if(i % 2 != 0 && i%3 == 0){
//             //     System.out.println(i);
//             // }
//                  System.out.println(i);

//         }
//     }
// }


// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int i ;
//         int n = sc.nextInt();
//         for(i=n;i<=1;i++){

//             // if(i % 2 != 0 && i%3 == 0){
//             //     System.out.println(i);
//             // }
//              System.out.println(i);

//         }
//     }
// }

// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int i ;
//         int n = sc.nextInt();
//         for(i=2; i<= 3*n;i=i+3){

//             // if(i % 2 != 0 && i%3 == 0){
//             //     System.out.println(i);
//             // }
//              System.out.println(i);

//         }
//         System.out.println(i);
//     }
// }



// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int i ;
        
//         for(i=99; i>0;i=i-4){

            
//              System.out.println(i);

//         }
//     }
// }


// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int i ;
//         int a = 1 ; 
//         int r = 2;
//         int n = sc.nextInt();
        
//         for(i = 1; i<=n;i++){
            
//             System.out.println(a);
//             a = a*r ;

//         }
//     }
//


// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=1;i<=n;i++){
//             if(i%2 != 0){
//                 System.out.println(i);
//             }else if(i%2 == 0){
//                 System.out.println(n);
//                 n = n-1;
//             }
//         }
//     }
// }

// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        

//         for(int i=65;i<=90;i++){
//             System.out.println((char)i + " " + i);
//         }
//     }
// }

// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         boolean flag = true;
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i == 0){
//                flag = false ;
//                 break ;
//             }
//         }
//         if(n == 1) System.out.println("Neither prime nor composite");
//        else if(flag == false) System.out.println("composite number");
//         else System.out.println("prime number");
//     }
// }

// public class loops{
//     public static void main(String[] args) {
//         int i = 1 ;
//         while(i<=10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// public class loops{
//     public static void main(String[] args) {
//         int i = 11 ;
//         do{
//             System.out.println(i);
//             i++;
//         }while(i<=10);
//     }
// }

// import java.util.Scanner ;

// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n==0)n=1 ;
//         int count = 0;
//         while(n != 0){
//             n = n/10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

// import java.util.Scanner ;

// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a = 0;
//         if(n<0) n=-n ;
//         while(n != 0){
//             a =a+ n%10;
//             n = n/10;
//         }
//         System.out.println(a);
//     }
// }

// import java.util.Scanner ;

// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = 0;
//         int sum = 0;
//         while(n != 0){
//             r *= 10;
//             sum += n%10;
//             r += n%10;
//             n = n/10;
//         }
//         System.out.println(r);
//         System.out.println(-sum);
//     }
// }


// import java.util.Scanner;

// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int factorial = 1;

//         while (n > 1) {
//             factorial = factorial * n;
//             n--;
//         }

//         System.out.println(factorial);
//     }
// }

// import java.util.Scanner;

// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int power = 1;

//         while (b > 0) {
//             power = power * a;
//             b--;
//         }

//         System.out.println(power);
//     }
// 