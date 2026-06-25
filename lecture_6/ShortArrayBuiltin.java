package lecture_6;

import java.util.Arrays ;

public class ShortArrayBuiltin {
    public static void main(String[] args) {
        int[] arr = {4,1,7,5,-3,10,2};
        arange(arr);
        // sort - ascending order
        Arrays.sort(arr);
        arange(arr);
    }
    public static void arange(int[] arr) {
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
