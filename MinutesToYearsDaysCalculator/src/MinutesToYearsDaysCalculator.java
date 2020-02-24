public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays (long minuites) {

        if (minuites >= 0) {
            long days = (minuites / 60) / 24;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minuites + " min = " + years + " y and " + remainingDays + " d");
        } else {
            System.out.println("Invalid value");
        }
    }
}
