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

import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        int b = (int)a ;

        if(a-b > 0){System.out.println("not integer");}
        else System.out.println("integer");
    }
}

