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

// public class Main {

//     public static void main(String[] args) {
//         int arr[]={2,0,9,34,423};
//         int n = arr.length ;
//         int d = 3 ;
//         d = d%n ;
//         reverse(arr,0,d-1);
//         reverse(arr,d,n-1);
//         reverse(arr,0,n-1);
//     }
//     public static void reverse(int[] arr,int i , int j ) {
//         while(i<j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp ;
//             i++ ;
//             j-- ;
//         }
//         for(int elem : arr){
//             System.out.print(elem+" ");
//         }
//         System.out.println();
//     }
// }

// *** question-7 ***

// public class Main {

//     public static void main(String[] args) {
//         int arr[] = {1,6,3,2,5};
//         int n = arr.length+1;

//         int sum = n*(n+1)/2 ;

//         int arrsum = 0;

//         for(int num : arr){
//             arrsum += num ;
//         }
//         System.out.println(sum-arrsum);
//     }
// }

// *** question-8 *** 

// public class Main {

//     public static void main(String[] args) {
//         int arr[]  = {0,1,0,1,0,1,0,1};

//         int countzeors = 0;

//         for(int elem : arr){
//             if(elem == 0)  countzeors++;
//         }

//         for(int i=0;i<arr.length;i++){
//             if(i<countzeors) arr[i] = 0;
//             else arr[i] = 1;
//         }

//         for(int elem : arr){
//             System.out.print(elem+" ");
//         }

//     }
// }

// second solution 

// public class Main {

//     public static void main(String[] args) {
//         int arr[] = {1,0,0,0,1,0,1};
//         int n = arr.length;

//         int i = 0 ;
//         int j = n-1 ;

//         while(i<j){
//             if(arr[i]==0) i++;
//             else if(arr[j]==1) j--;
//             else if(arr[i]==1 && arr[j]==0){
//                 int temp = arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//                 // arr[i] = 0;
//                 // arr[j] = 1;
//                 i++;
//                 j--;
//             }
//         }
//         for(int elem : arr){
//             System.out.print(elem+" ");
//         }
//     }
// }

// *** question-8 *** 

// public class Main {

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};

//         for(int i=0;i<arr.length-1;i+=2){
//                 int temp = arr[i];
//                 arr[i] = arr[i+1];
//                 arr[i+1] = temp;
//         }
//             for(int elem : arr){
//                 System.out.print(elem+" ");
//             }
//     }
// }

// *** question-9 ***


// import java.util.ArrayList;
// import java.util.Collections;

// public class Main {

//     public static void main(String[] args) {
//         int arr[] = { 9, 9, 9 };

//         ArrayList<Integer> result = addOne(arr);

//         System.out.print(result);
//     }

//     public static ArrayList<Integer> addOne(int arr[]) {

//         ArrayList<Integer> ans = new ArrayList<>();

//         int n = arr.length;
//         int carry = 1;

//         for (int i = n - 1; i >= 0; i--) {
//             if (arr[i] + carry <= 9) {
//                 ans.add(arr[i] + carry);
//                 carry = 0;
//             } else {
//                 ans.add(0);
//                 carry = 1;
//             }
//         }
//         if (carry == 1) {
//             ans.add(1);
//         }

//         Collections.reverse(ans);
//         return ans;
//     }
// }

// *** question-10 *** 

public class Main {

    public static void main(String[] args) {
        int a  [] = {1,2,3,4,5,6,7,19301243,38472936};
        int b [] = {9,10,19,29,23,24,154,22321};
        int c [] = new int [a.length+b.length]; 

        for(int elem : c){
            System.out.print(elem+" ");
        }

        System.out.println();

        merge(a,b,c);

        for(int elem : c){
            System.out.print(elem+" ");
        }
    }
    public static void merge(int a[],int b[],int c[]) {
        int i = 0,j = 0,k = 0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]) {c[k++] = a[i++];}
            else {c[k++] = b[j++];}
        }

        while(i<a.length){
            c[k++] = a[i++];
        }

        while(j<b.length){
            c[k++] = b[j++];
        }
    }
} // sum of two array
// update and read and create 
// Array 