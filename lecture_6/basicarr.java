package lecture_6;

public class basicarr {
    public static void main(String[] args) {
        int[] arr = {-7,-3,8,90,45,3,-34};
        int min = arr[0];

        for(int i=0 ; i<7;i++){
            if(arr[i]<min) min = arr[i];
        }
        System.out.println(min);
    }
}
