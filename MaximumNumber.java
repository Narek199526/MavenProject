public class MaximumNumber {
    public static void main(String[] args) {
        int result = maximumNumber(59965652,654465);
        System.out.println("Your maximum value is " + result);
    }

    public static int maximumNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}
