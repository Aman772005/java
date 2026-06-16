package lecture_5;

// public class returntype {
//     public static int aman(int a) {
//         System.out.println("Aman");
//         if(a>5) return 10;
//         else return 20 ;  
//     }
//     public static void main(String[] args) {
//         int x = aman(6);
//         System.out.println(x+3);
//     }
// }


// public class  returntype  {
//     public static int max(int a , int b , int c) { // parameters
//         if(a>=b && a>=c) return a;
//         else if(b>=a && b>=c) return b;
//         else return c;
//     }
//     public static void main(String[] args) {
//         System.out.print(max(3,5,1)); // arguments 
//     }
// }

// import java.util.Scanner;
// public class returntype {
//     public static int fact(int x) {
//         int f = 1;
//         for(int i = 1;i<=x;i++){
//             f *= i;
//         }
//         return f ;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();

//         int ncr = fact(n)/(fact(r)*fact(n-r));
//         int npr = fact(n)/fact(n-r);

//         System.out.println(ncr+" "+npr);
//     }
// }
// import java.util.Scanner;
// public class returntype {

//     public static void swap(int a , int b) {
//         int temp = a;
//         a = b;
//         b = temp;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          int a = sc.nextInt();
//          int b = sc.nextInt();


//         System.out.println(a+ " "+b);
//         swap(a,b);
//         System.out.println(a+ " "+b);
//     }
// }
