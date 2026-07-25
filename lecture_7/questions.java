// import java.util.Arrays;

// public class questions {
//     public static void main(String[] args) {
//         int arr[] = { 1, 5, 9, 3, 2, 6 };
//         int target = 9;
//         int n = arr.length;
//         Arrays.sort(arr);
//         int i = 0;
//         int j = n - 1;

//         while (i < j) {
//             if (arr[i] + arr[j] == target) {
//                 System.out.println(arr[i] + " " + arr[j]);
//                 return;-
//             } else if (arr[i] + arr[j] > target) {
//                 j--;
//             } else {
//                 i++;
//             }
//         }
//         System.out.println("not found");
//     }
// }

// import java.util.ArrayList;
// import java.util.Arrays;

// public class questions {
//     public static void common(int arr1[],int arr2[]) {
//         int n = arr1.length;
//         int m = arr2.length;
//          ArrayList<Integer> numbers = new ArrayList<>();

//         Arrays.sort(arr1);
//         Arrays.sort(arr2);

//         int i = 0;
//         int j = 0;

//         while(i<n && j<m){
//             if(arr1[i] == arr2[j]){
//                 numbers.add(arr1[i]);
//                 i++;
//                 j++;
//             }else if (arr1[i]<arr2[j]){
//                 i++;
//             }else{
//                 j++;
//             }
//         }
//         System.out.print(numbers+" ");
//     }

//     public static void main(String[] args) {
//         int arr1[] = {3,4,2,2,4};
//         int arr2[] = {3,2,2,7};
//         common(arr1,arr2);
//     }
// }

public class questions {

    public static void main(String[] args) {
        int arr[] = {1,6,7,8,2,3};
        int k = 4;
        int n = arr.length;

        for(int i = 0;i<k;i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j = i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        System.out.println(arr[k-1]);
    }
}