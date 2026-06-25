package lecture_6;

// *** question-1 *** 

// public class Questions {

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,8,9};
//         index(arr);
//     }

//     public static void index(int[] arr) {
//         for(int i = 0;i< arr.length;i++){
//             if(i%2 == 0){
//                 arr[i] = arr[i] + 10;
//             }else{
//                 arr[i]=arr[i]*2 ;
//             }
//             System.out.print(arr[i]+" ");
//         }

//     }
// }

// *** question-2 ***

public class Questions {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int x = 19 ;
        search(arr,x);
    }
    public static void search(int[] arr,int x) {
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]) {
                System.out.println("founded");
                 return ;
            }
        } 
        System.out.println("not founded");
    }
}