public class BinarySearch {

    public static int search(int arr[],int target) {
        int lo = 0,hi=arr.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == target) return arr[mid];
            else if(arr[mid] < target) lo = mid+1;
            else hi = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {-76,-4,9,90,900,999,1000,1111,2222,33333};
        int target = 99;
        System.out.print(search(arr,target));  
    }
}
// update
// updated
// MONDAY 