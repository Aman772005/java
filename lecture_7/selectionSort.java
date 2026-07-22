public class selectionSort {

    public static void print(int arr[]) {
        for(int elem : arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr []= {5,-2,7,-1,0,8,9,};
        int n= arr.length;
        print(arr);
        for(int i=0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j = i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindex = j ;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        print(arr);
    }
}
// 9o3
// 1034
