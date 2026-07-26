public class insertionsort {
    public static void main(String[] args) {
        int arr[] = {4,1,17,31,9,6};
        for(int i = 1;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
            }
            for(int elem : arr) System.out.print(elem+" ");
    }   
}
