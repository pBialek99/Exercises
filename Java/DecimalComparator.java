public class DecimalComparator {
    // write code here
    public static boolean areEqualByThreeDecimalPlaces(double p1, double p2) {
        return ((int)(p1 * 1000) == (int)(p2 * 1000));
    }
}
