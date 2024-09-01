public class AreaCalculator {
    // write code here
    public static double area(double radius) {
        return (radius < 0) ? -1.0d : (double) (Math.PI * Math.pow(radius, 2));
        
    }
    public static double area(double x, double y) {
        return (x < 0 || y < 0) ? -1.0d : (double) (x * y);
    }
}
