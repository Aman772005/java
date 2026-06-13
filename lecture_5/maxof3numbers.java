package lecture_5;

// import java.util.Scanner;

// public class maxof3numbers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the numbers : ");

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         System.out.println(Math.max(Math.max(a,b),c));

//     }
// }


//  *** for 4 numbers *** 

import java.util.Scanner;

public class maxof3numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers : ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(Math.max(Math.max(a,b),Math.max(c,d)));

    }
}