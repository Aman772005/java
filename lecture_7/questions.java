import java.util.Arrays;

public class questions {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 9, 3, 2, 6 };
        int target = 9;
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] + arr[j] == target) {
                System.out.println(arr[i] + " " + arr[j]);
                return;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("not found");
    }
}
