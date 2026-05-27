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

import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i=2;i<=n-1;i++){
            if(n%i == 0){
                System.out.println("composite number");
                break ;
            }
        }
    }
}





