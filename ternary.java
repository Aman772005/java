// import java.util.Scanner;
// public class ternary {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         System.out.println((a%2==0) ? "even":"odd");
//     }
// }

import java.util.Scanner;
public class ternary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();



        System.out.println(((a>b)?((a>c)?a:c):((b>c)?b:c)));
    }
}
