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


public class BinarySearch {

    public static int target(int arr[],int k) {
        int lo = 0, hi = arr.length-1,idx = -1 ;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>k) hi = mid - 1 ;
            else if(arr[mid]<k) lo = mid + 1;
            else{
                idx = mid ;
                hi = mid -1;
            }
        }
        return idx ;
    }

    public static void main(String[] args) {
        int arr [] = {1,1,2,2,2,3,3,4,4,5,5,5,6,6};
        int k = 5;
        System.out.print(target(arr,k));
    }
}
// update 