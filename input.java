// import java.util.Scanner;

// public class input {
//     public static void main(String[]  args){
//         Scanner sc = new Scanner(System.in);

//         double r = sc.nextDouble();
//         double a = 3.141592 * r *r;

//         System.out.println(a);
//     }
// }


// *** Square of given no. ***

// import java.util.Scanner;

// public class input{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in) ;

//         System.out.print("Enter the length : ");
//         double length = sc.nextDouble();

//         double area = length * length ;
//         System.out.print("Area of square : " + area);
//     }
// }

// *** sum 2-3 no. ***

// import java.util.Scanner;

// public class input{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a value : ");
//         double a = sc.nextDouble();

//         System.out.print("Enter b value : ");
//         double b = sc.nextDouble();

//         System.out.print("Enter c value : ");
//         double c = sc.nextDouble();

//         double sum = a + b + c ;
//         System.out.print("Sum of a,b and c : "+ sum);

//     }
// }



// *** calculate simple interest *** 

import java.util.Scanner;

public class input{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter p : ");
        double p = sc.nextDouble();

        System.out.print("Enter r : ");
        double r = sc.nextDouble();

        System.out.print("Enter t : ");
        double t = sc.nextDouble();

        double si = (p*r*t)/100 ;
        System.out.println("SI is : "+ si);
    }
}