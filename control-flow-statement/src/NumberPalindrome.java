public class NumberPalindrome {



    public static boolean isPalindrome(int number) {
        int input = number;
        int originalNumber = number;
        int reversedNumber = 0;
        int lastDigit;
        if (number < 0) {
            number = number * (-1);
            originalNumber = originalNumber * (-1);
        }
        while (number > 0) {
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber == originalNumber;
    }
}
