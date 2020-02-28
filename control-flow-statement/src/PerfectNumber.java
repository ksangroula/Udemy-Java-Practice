public class PerfectNumber {


    public static boolean isPerfectNumber (int number) {
        int sum = 0;

        if (number > 0) {
            for (int i = 1; i < number; i++) {
                int divisor = number % i;
                if (divisor == 0) {
                    sum += i;
                }
            }
            return sum == number;
        }
        return false;
    }
}
