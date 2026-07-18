public class bubblesort {
    public static void print(int arr[]) {
        for(int elem : arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,2,3,4,-5,0,2,7};
        int n = arr.length-1;
        print(arr);
        for(int j=1;j<n;j++){
            for(int i = 0;i<n-j;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                     arr[i] = arr[i+1] ;
                     arr[i+1] = temp;
                }
            }
        }
        print(arr);
    }
}
