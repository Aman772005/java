package lecture_6;

import java.util.ArrayList;
import java.util.Collections;

public class arrlist{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(24);
        arr.add(23);
        arr.add(22);
        arr.add(21);
        arr.add(212);

        // System.out.println(arr.get(2));
        // System.out.println(arr.get(3));
        // arr.set(3,50);
        // System.out.println(arr.get(3));

        // int n = arr.size(); // arr.length

        // for(int i=0;i<n;i++){
        //     System.out.print(arr.get(i)+"  ");
        // }

        // System.out.println();

        // for(int num : arr){
        //     System.out.print(num+" ");
        // }

        // System.out.println();

        // System.out.print(arr);

        // System.out.println();

        // arr.add(43);
        // System.out.print(arr);
        // System.out.println();
        // arr.add(1,100);
        // System.out.print(arr);

        Collections.reverse(arr);
        System.out.print(arr);


    }
}
