public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1266634));
    }

    public static int getEvenDigitSum (int number) {
        int sum = 0;
        int originalNumber = number;

        if (number >= 0) {
            while (number > 0) {


            int lastDigit = number % 10;

                if (lastDigit % 2 == 0) {
                     sum += lastDigit;
                }
            number /= 10;

        }
            System.out.println("The sum of even digits within a number " + originalNumber + " is equal to: " + sum);
            return (sum);


        } else {
            System.out.println("-1");
            return -1;
        }


    }
}
