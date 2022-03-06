public class CountingArrayNumbers {
    public static void main(String[] args) {
        double[] array = {-56465, 546, 265,-5465, 5123, 136, 65266, 65411};
        int n = 4;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += array[i];
        }
        if (count < 0) {
            System.out.println("Can't calculate. Number should be greater");
        } else {
            System.out.println(count);
        }
    }
}
