public class NumberPercentCount {
    public static void main(String[] args) {
        short[] array = {12, 54, 55, 77, 13, 5, 65, 96, 1567};
        for (int i = 0; i < array.length; i++) {
            double arrayOddArgs = 0;
            double arg = (double)array[i];
            if(array[i] % 2 != 0){
                arrayOddArgs =  (arg + arg * arg / 100);
                System.out.println(arrayOddArgs);
            }
        }
    }
}
