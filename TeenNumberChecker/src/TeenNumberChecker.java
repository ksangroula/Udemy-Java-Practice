public class TeenNumberChecker {

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        if(firstNumber >= 13 && firstNumber <= 19) {
            return true;
        } else if (secondNumber >= 13 && secondNumber <= 19) {

            return true;
        } else if (thirdNumber >= 13 && thirdNumber <= 19) {

            return true;
        } else {

            return false;
        }
    }

    public static boolean isTeen(int firstNumber) {
        if(firstNumber >= 13 && firstNumber <= 19) {
            return true;

        } else {

            return false;
        }
    }

}