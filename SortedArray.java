public class SortedArray {

    public static void main(String[] args) {
        int[] array = {2, 2, 5, 5, 5, 2, 2, 5, 2, 5, 2, 2};
        int store = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] > array[j]) {
                    store = array[i];
                    array[i] = array[j];
                    array[j] = store;
                }
            }
            System.out.println(array[i]);
        }
    }
}
