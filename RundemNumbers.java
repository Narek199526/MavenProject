public class RundemNumbers {
    public class Main {

        public static void main(String[] args) {
            int randomValue = randomNumbers();
            System.out.println(randomValue);
        }

        public static int randomNumbers() {
            int arg = 100;
            int value = arg + (int) +(Math.random() * arg);
            return value;
        }
    }
}
