public class TeenNumberChecker {
    // write code here
    public static boolean hasTeen(int p1, int p2, int p3) {
        return ( isTeen(p1) || isTeen(p2) || isTeen(p3) ) ? true : false;
    }
    
    public static boolean isTeen(int p) {
        return (p >= 13 && p <= 19) ? true : false;
    }
}
