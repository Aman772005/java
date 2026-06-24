package lecture_6;

public class passingArrarytoMethod {
    public static void main(String[] args) {
        int[] x = {12,23,36};
        System.out.println(x[1]);
        change(x);
        System.out.println(x[1]);
    }
    public static void change(int[] x) {
        x[1] = 24 ;
    }
}
