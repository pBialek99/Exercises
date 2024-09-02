public class SharedDigit {
    // write code here
    public static boolean hasSharedDigit(int x, int y) {
        if ((x >= 10 && x <= 99) && (y >= 10 && y <= 99)) {
            int originalY = y;
            
            int digitX = 0;
            int digitY = 0;
            
            while (x > 0) {
                digitX = x % 10;
                x = x / 10;
                
                while (y > 0) {
                    digitY = y % 10;
                    y = y / 10;
                    
                    if (digitX == digitY) {
                        return true;
                    }
                }
                y = originalY;
            }
            return false;
        }
        else return false;
    }
}
