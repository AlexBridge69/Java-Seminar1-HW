import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
    }
    public static void duplicateZeros(int[] arr) {
        int count_of_zeros = 0;
        for (int i = 0; i < arr.length - 1; i ++) {
            if (arr[i] == 0) {
                count_of_zeros ++;
            }
        }
        int i = arr.length - 1;
        for (int j = arr.length - count_of_zeros - 1; j > 0; j --) {
            if (arr[j] == 0) {
                arr[i] = 0;
                arr[i - 1] = 0;
                i -= 2;
            }
            else {
                arr[i] = arr[j];
                i --;
            }
        }
    }
}