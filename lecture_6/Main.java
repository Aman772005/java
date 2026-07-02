package lecture_6;

// *** question-1 *** 

// public class Questions {

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,8,9};
//         index(arr);
//     }

//     public static void index(int[] arr) {
//         for(int i = 0;i< arr.length;i++){
//             if(i%2 == 0){
//                 arr[i] = arr[i] + 10;
//             }else{
//                 arr[i]=arr[i]*2 ;
//             }
//             System.out.print(arr[i]+" ");
//         }

//     }
// }

// *** question-2 ***

// public class Questions {

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,8,9,10};
//         int x = 19 ;
//         search(arr,x);
//     }
//     public static void search(int[] arr,int x) {
//         for(int i=0;i<arr.length;i++){
//             if(x==arr[i]) {
//                 System.out.println("founded");
//                  return ;
//             }
//         } 
//         System.out.println("not founded");
//     }
// }


// *** question-3 *** 

// public class Questions {

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6};
//         int target = 9 ;
//         TwoSum(arr,target);
//     }
//     public static void TwoSum(int arr[],int target) {
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]+arr[j]==target){
//                     System.out.println(arr[i]+" "+arr[j]);
//                     System.out.println(i+" "+j);
//                     return ;
//                }
//             }
//         }
//         System.out.println("Not founded");
//     }
// }


// *** question-4 *** 

// import java.util.Arrays;

// public class Questions {

//     public static void main(String[] args) {
//         int arr[] = {4, 10, 10, 6, 8};

//         Arrays.sort(arr);

//         int max = arr[arr.length - 1];

//         for (int i = arr.length - 2; i >= 0; i--) {
//             if (arr[i] != max) {
//                 System.out.println("Second max number is: " + arr[i]);
//                 break;
//             }
//         }
//     }
// }

// *** question-5 *** 

// soultion-1 

//public class Questions {

//     public static void main(String[] args) {
//         int arr[]= {1,2,3,45,5};

//         int arr1[] = new int [arr.length];
//         int j = 0;

//         for(int i=arr.length-1;i>=0;i--){
//             arr1[j]=arr[i];
//             j++;
//         }
//         for(int elem : arr1){
//             System.out.print(elem+" ");
//         }
//     }
// }


// solution-2 

// public class Questions {

//     public static void main(String[] args) {
//         int arr[]= {3,19,56,9,83,18,24,85,14};
//         int n = arr.length;
//         int i = 2 , j= n-4;
//         while (i<j) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp ;
//             i++;
//             j--;
//         }
//         // for(int i = 0;i<n/2;i++){
//         //     int temp = arr[i];
//         //     arr[i] = arr[n-1-i];
//         //     arr[n-1-i] = temp ;
//         //     }
//         for(int elem : arr) System.out.print(elem+" ");
//     }
// }


// **** question-6 *** 

public class Main {

    public static void main(String[] args) {
        int arr[]={2,0,9,34,423};
        int n = arr.length ;
        int d = 3 ;
        d = d%n ;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr,int i , int j ) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++ ;
            j-- ;
        }
        for(int elem : arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
}

// 10:53