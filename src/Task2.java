import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        removeElement(arr, 0);
    }

    public static int removeElement(int[] nums, int val) {
//      Сначала ищем максимальное число в массиве.
        int maxElement = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxElement) maxElement = nums[i];
        }
//      Теперь каждый элемент, равный необходимому значению,
//      заменяем числом, равным максимальному, увеличенным на 1.
//      Заодно считаем количество таких элементов.
        int countOfVal = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = maxElement + 1;
                countOfVal ++;
            }
        }
//      Теперь все "ненужные" элементы являются самыми большими в массиве.
//      Так как порядок "нужных" элементов не важен, то, отсортировав массив,
//      все "ненужные" элементы станут последнимим в массиве.
        Arrays.sort(nums);
//      А теперь возвращаем на места исходное значение.
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == maxElement + 1) nums[i] = val;
        }
        
        System.out.println(Arrays.toString(nums));
        return nums.length - countOfVal;
    }
}