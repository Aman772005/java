package lecture_6;

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] x = {6,7,8,9,10};

        // // indexing
        // System.out.println(x[3]);
        // // updating
        // x[3]=89;
        // System.out.println(x[3]);

        // int[]  arr = new int[4];
        // arr[0] = 2 ;
        // arr[1] = 9 ;
        // arr[2] = 4 ;
        // arr[3] = 210 ;
        // System.out.println(arr[0]);

        // int arr[] = {5,6,9,23,121};
        // int n = arr.length;
        // System.out.println(n);
        // for(int i=0;i<n;i++){
        //     System.out.println(arr[i]);
        // }

        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int sumofarr = 0 ;
        int productofarr = 1;

        System.out.print("Enter arr "+ n);

        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
             sumofarr += arr[i] ;
             productofarr *= arr[i];
        }

        System.out.println(sumofarr);
        System.out.println(productofarr);


        // for(int i = 0;i<n;i++){
        //     if(arr[i]<0){
        //         System.out.println(arr[i]);
        //     }
        // }

        // product of arr and sum of arr 

    }
}

// arr 
// arr
// commemts
// one day left