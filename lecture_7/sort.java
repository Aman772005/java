public class sort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5};
        int n = arr.length-1;
        boolean isSorted = arrsort(arr,n);
        System.out.println(isSorted);
    }
    public static boolean arrsort(int arr[],int n ) {
        for(int i=0;i<n;i++){
            if(arr[i]>arr[i+1]) return false ;
        }
        return true ;
    }
};
