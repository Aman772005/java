// even or odd

// import java.util.Scanner;

// public class if_else{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number : ");
//         int a = sc.nextInt();

//         if(a%2 == 0){
//             System.out.println(" a is even ");
//         }else{
//             System.out.println(" a is odd ");
//         }
//     }
// }

// import java.util.Scanner;

// public class if_else {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         if(a%5 == 0) System.out.println("divisible by 5");

//         else System.out.println("not divisible by 5");
//     }
// }

// import java.util.Scanner;

// public class if_else {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         if(a>0) System.out.println(a);

//         else{
//         //   a = a*-1;
//           System.out.println(-a);
//         }
//     }
// }

// import java.util.Scanner;

// public class if_else {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         double a = sc.nextDouble();
//         int b = (int)a ;

//         if(a-b > 0){System.out.println("not integer");}
//         else System.out.println("integer");
//     }
// }

// import java.util.Scanner;

// public class if_else{
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);

//         int cp = sc.nextInt();
//         int sp = sc.nextInt();
//         int pl = sp-cp ;

//         if( pl > 0 ){
//             double p = sp-cp ;
//             System.out.println("Profit" + (p/cp)*100);
//         }else if(pl == 0){
//             System.out.println("no profit no loss");
//         }
//         else{
//             double l = cp-sp;
//             System.out.println("loss" + (l/cp)*100);
//         }
//     }
// }


// import java.util.Scanner;

// public class if_else{
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);

//         int n = sc.nextInt();

//         if(n>999 && n<10000){
//             System.out.println("four digit number");
//         }else{
//             System.out.println("not a four digit number");
//         }

//     }
// }

// import java.util.Scanner;

// public class if_else {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         if(n>0){
//             if(n<69){
//                 System.out.println("smaller than 69");
//             }else{
//                 System.out.println("greater than 69");
//             }
//         }else{
//             int a = -n ;
//             if(a<69){
//                 System.out.println("smaller than 69");
//             }else{
//                 System.out.println("greater than 69");
//             }
//         }
//     }
// }

// import java.util.Scanner;

// public class if_else {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         if( a%5 == 0 || a%3 == 0 ){
//             System.out.println("a is divisible by 5 0r 3 ");
//         }else System.out.println("not divisible by 3 and 5");
//     }
// }

// import java.util.Scanner;

// public class if_else {

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if((a+b > c) && (b+c > a) && (c+a > b)){
//             System.out.println("are sides of triangle");
//         }else System.out.println("are not sides of triangle");
//     }
// }

// import java.util.Scanner;

// public class if_else{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         if(n%5 == 0 && n%3 == 0){
//             System.out.println("reble kid");
//         }else if(n%5 == 0){
//             System.out.println("Riya");
//         }else if(n%3 == 0){
//             System.out.println("Banu");
//         }else{
//             System.out.println("Isha");
//         }
//     }
// }

// import java.util.Scanner;

// public class if_else {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int area = a*b ;
//         int parimeter = 2*(a+b);

//         if(area > parimeter){
//             System.out.println("area" + area + "is greater that parimeter"+parimeter );
//         }else{
//             System.out.println("area" + area + "is smaller that parimeter"+parimeter);
//         }
//     }
// }

// import java.util.Scanner;
// public class if_else {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if(a>0 && b>0)System.out.println("1 qua");
//         else if(a>0 && b<0)System.out.println("2 qua");
//         else if(a<0 && b<0)System.out.println("3 qua");
//         else if(a<0 && b>0)System.out.println("4 qua");
//         else if(a==0 && b>0 || b<0)System.out.println("y-axis");
//         else if(b==0 && a>0 || a<0)System.out.println("x-axis");
//         else System.out.println("on origin");
//     }
// }

import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            if(a>c)System.out.println("a is greatest");
            else System.out.println("c is greatest");
        }else{
            if(b>c) System.out.println("b is greatest");
            else System.out.println("c is greatest");
        }
    }
}