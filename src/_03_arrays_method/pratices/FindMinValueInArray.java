package _03_arrays_method.pratices;

public class FindMinValueInArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int min = minValue(arr);
        System.out.println("The smallest element in the array is: " + min);
    }

    public static int minValue(int[] array) {
        int minArr = array[0];
        for (int j = 0; j < array.length; j++) {
            if (minArr > array[j]) {
                minArr = array[j];
            }
        }
        return minArr;
    }
}
