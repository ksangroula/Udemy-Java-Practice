public class FirstLastDigitSum {



    public static int sumFirstAndLastDigit(int number) {


        if (number >= 0) {
            int firstDigit = 0;
            int lastDigit = number % 10;

            while (number != 0) {
                firstDigit = number % 10;
                number = number / 10;

            }
            return (firstDigit + lastDigit);


        } else {
            System.out.println("-1");
            return -1;
        }


    }

}



