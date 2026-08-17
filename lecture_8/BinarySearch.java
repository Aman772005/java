// public class BinarySearch {

//     public static int search(int arr[],int target) {
//         int lo = 0,hi=arr.length-1;
//         while(lo<=hi){
//             int mid = lo+(hi-lo)/2;
//             if(arr[mid] == target) return arr[mid];
//             else if(arr[mid] < target) lo = mid+1;
//             else hi = mid-1;
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = {-76,-4,9,90,900,999,1000,1111,2222,33333};
//         int target = 99;
//         System.out.print(search(arr,target));  
//     }
// }


// public class BinarySearch {

//     public static int target(int arr[],int k) {
//         int lo = 0, hi = arr.length-1,idx = -1 ;
//         while(lo<=hi){
//             int mid = (lo+hi)/2;
//             if(arr[mid]>k) hi = mid - 1 ;
//             else if(arr[mid]<k) lo = mid + 1;
//             else{
//                 idx = mid ;
//                 hi = mid -1;
//             }
//         }
//         return idx ;
//     }

//     public static void main(String[] args) {
//         int arr [] = {1,1,2,2,2,3,3,4,4,5,5,5,6,6};
//         int k = 5;
//         System.out.print(target(arr,k));
//     }
// }

// public class BinarySearch{
//     public static int search(int arr[],int target) {
//         int hi = 0,lo = arr.length-1;
//         while(hi<=lo){
//             int mid = (lo+hi)/2;
//             if(arr[mid] == target) return arr[mid];
//             else if (arr[mid]>target) hi = mid +1 ;
//             else lo = mid-1 ;
//         }
//         return -1 ;
//     }
//     public static void main(String[] args) {
//         int arr[] = {100,90,80,70,60,50,40,30,20,10};
//         int target = 30;
//         System.out.println(search(arr,target));
//     }
// }

// public class BinarySearch{
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7,8,4,3,2,1};

//         int lo = 1,hi = arr.length-2;
//         while(lo<=hi){
//             int mid = (lo+hi)/2;
//             if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]) {
//                 System.out.println(mid);
//                 break ;
//             }
//             else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) hi = mid - 1 ;
//             else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo = mid + 1;
//         }
//     }
// }

// gfg floor of sorted array 
// class Solution {
//     static int findFloor(int[] arr, int x) {
//         int lo = 0;
//         int hi = arr.length-1 ;
//         int ans = -1 ;
//         while(lo<=hi){
//             int mid = (lo+hi)/2;
//             if(arr[mid]>x) hi = mid-1 ;
//             else {
//                 ans = mid ;
//                 lo = mid+1;
//             }
//         }
//         return ans;
//     }
// }



// class Solution {
//     int floorSqrt(int n) {
//         // code here
//         int root = 0;
//         for(int i = 1;i<=n;i++){
//             if(i*i > n) break;
//             root = i ;
//         }
//         return root ;
//     }
// }







