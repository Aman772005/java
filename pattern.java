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

import java.util.Scanner;

public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of lines : ");
        int a = sc.nextInt();

        for(int i = a ; i>= 1 ; i--){
            for(int j = 1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}