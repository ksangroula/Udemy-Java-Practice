public class AreaCalculator {

    public static double area (double radius) {

        final double PI = Math.PI;

        if (radius >= 0) {
            radius = radius * radius * PI;
            System.out.println(radius);
            return  radius;
        } else {
            System.out.println("-1");
            return -1;
        }
    }

    public static double area (double x, double y) {

        if (x >= 0 && y >= 0) {
            double calculatedArea = x * y;
            System.out.println(calculatedArea);
            return calculatedArea;
        } else {
            System.out.println("-1");
            return -1;
        }
    }
}
