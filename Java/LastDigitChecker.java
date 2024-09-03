public class LastDigitChecker {
    // write code here
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((isValid(x)) && (isValid(y)) && (isValid(z))) {
            int digitX = (x % 10);
            int digitY = (y % 10);
            int digitZ = (z % 10);
            
            if ((digitX == digitY) || (digitX == digitZ) || (digitY == digitZ)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    public static boolean isValid(int a) {
        if (a >= 10 && a <= 1000) {
            return true;
        }
        else {
            return false;
        }
    }
}
