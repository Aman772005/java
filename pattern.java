// import java.util.Scanner;

// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("rows");
//         int rows = sc.nextInt();

//         System.out.print("coloums");
//         int coloums = sc.nextInt();

//         for (int i = 1 ; i <= rows ; i++) {

//             for (int j = 1 ; j <= coloums ; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("1");
//         }
//     }

// }

// import java.util.Scanner;

// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("rows : ");
//         int rows = sc.nextInt();

//         int coloums = rows ;


//         for (int i = 1 ; i <= rows ; i++) {

//             for (int j = 1 ; j <= coloums ; j++) {
//                 if(i%2==0){
//                     System.out.print((char)(i+64));
//                 }else System.out.print((char)(i+96));
//             }
//             System.out.println();
//         }
//     }

// }

// or 

// import java.util.Scanner;

// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("rows : ");
//         int rows = sc.nextInt();

//         int coloums = rows ;

//         for (int i = 1 ; i <= rows ; i++) {

//             for (int j = 1 ; j <= coloums ; j++) {
//                 System.out.print((char)(j+96));
//             }
//             System.out.println();
//         }
//     }

// }

// import java.util.Scanner;

// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("rows : ");
//         int rows = sc.nextInt();

//         int coloums = rows ;

//         for (int i = 1 ; i <= rows ; i++) {

//             for (int j = 1 ; j <= coloums ; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }

// }

// **** combination of alphabates and number **** 

// import java.util.Scanner ;

// public class pattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("no of lines : ");
//         int a = sc.nextInt();

//         for(int i=1;i<=a;i++){
//             for(int j=1 ; j<=i ;j++){
//                 if(i%2 == 0){
//                     System.out.print((char)(j+64));
//                 }else System.out.print(j);
                
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class pattern{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Number of lines : ");
//         int a = sc.nextInt();
//         int n = a ;

//         for(int i = 1 ; i<=a ; i++){
//             for(int j = 1;j<=n;j++){
//                 System.out.print((char)(i+64));
//             }
//             n--;
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class pattern{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("length : ");
//         int a = sc.nextInt();
//         System.out.println("Breadth : ");
//         int b = sc.nextInt();

//         for(int i = 1;i<=b;i++){
//             for(int j = 1;j<=a;j++){
                
//                 if(i==1 || i==b || j==1 || j==a){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }

//     }
// // }

// import java.util.Scanner;

// public class pattern{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int n = a/2 ;
//         n = n+1 ;

//         System.out.println(n);

//         for(int i = 1 ; i<=a;i++){
//             for(int j = 1;j<=a;j++){
//                 if(i==n || j==n){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// }


// import java.util.Scanner;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {

//                 if (i == j || i + j == n - 1) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }

//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a = 1;
        

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(a);
//                 a++;
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if((i+j)%2 == 0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.Scanner;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a = 1;
        

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(a);
//                 a=a+2;
//             }
//             a=1;
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
       
        

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if(i+j<=4){
//                     System.out.print(" ");
//                 }else System.out.print("*");
//             }
             
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
       
        

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i; j++){
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
             
//             System.out.println();
//         }
//     }
// }


// import java.util.Scanner;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int a = 1;
       
        

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i; j++){
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++){
//                 System.out.print((char)(i+64));
//                 a++;
//             }
//              a= 1;
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int a = 1;
       
        

//         for(int i = 1 ; i<=n;i++){
//             for(int j = 1;j<= n-i;j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j = 1; j<=n;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int a = 1;
       
        

//         for(int i = 1 ; i<=n;i++){
//             for(int j = 1;j<= i-1;j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j = 1; j<=n-i+1;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int a = 1;
       
        

//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=n-i;j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j= 1;j<=(2*i-1);j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// import java.util.Scanner;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int a = 1;
//         int nsp = n-1 ;
//         int nst = 1 ;
       
        

//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=nsp;j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j= 1;j<=nst;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println(" ");
//             nsp--;
//             nst+= 2;
//         }
//     }
// }

// import java.util.Scanner;
// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int nsp = n-1 ;
//         int nst = 1 ;
       
        

//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=nsp;j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j= 1;j<=nst;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println(" ");
//             nsp--;
//             nst+= 2;
//         }

//         nsp = 1 ;
//         nst = 2*n-3 ;
       
        

//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=nsp;j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j= 1;j<=nst;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println(" ");
//             nsp++;
//             nst-= 2;
//         }
//     }
// }

// import java.util.Scanner ;

// public class pattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//          for(int j = 1;j<=2*n-1;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();

//         for(int i = 1; i<=n-1;i++){
           
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("*"+" ");
//             }
//             for(int j= 1; j<= 2*i-1;j++){
//                 System.out.print(" "+" ");
//             }
//             for(int j = 1;j<=n-i;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }


import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1;i<=2*n-1;i++){
            for(int j = 1;j<=2*n-1;j++){
                int a = i,b=j;
                if(i>n) a = 2*n-i;
                if(j>n) b=2*n-j;
                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();
        }
    }
}



