// aescending order
// public class bubblesort {
//     public static void print(int arr[]) {
//         for(int elem : arr){
//             System.out.print(elem+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,-2,2,3,4,-5,0,2,7};
//         int n = arr.length-1;
//         print(arr);
//         for(int j=1;j<n;j++){
//             int swaps = 0;
//             for(int i = 0;i<n-j;i++){
//                 if(arr[i]>arr[i+1]){
//                     int temp = arr[i];
//                      arr[i] = arr[i+1] ;
//                      arr[i+1] = temp;
//                      swaps++;
//                 }
//             }
//             if(swaps==0) break;
//         }
//         print(arr);
//     }
// };

// descending order 

// public class bubblesort {

//     public static void print(int arr[]) {
//         for(int elem : arr){
//             System.out.print(elem+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,-2,-5,7,9};
//         int n = arr.length-1;

//         print(arr);
//         for(int i = 0;i<n ;i++){
//             int swap = 0;
//             for(int j = 0;j<n-i;j++){
//                 if(arr[j]<arr[j+1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//                 swap++;
//                 }
//             }
//             if(swap==0) break ;
//         }
//         print(arr);
//     }
// }

public class bubblesort {

    public static void print(int arr[]) {
        for(int elem : arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,4,2,14,0,31,0,24,4,0,0,0,-1,-1,-23,0};
        int n = arr.length-1;

        print(arr);

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i;j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]!=0 && arr[j+1]!=0 && arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        print(arr);
    }
}