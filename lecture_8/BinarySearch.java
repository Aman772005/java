public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {9,8,3,2,1,10,-4,-21};

        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}