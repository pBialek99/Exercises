public class FlourPacker {
    // write code here
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        
        bigCount = bigCount * 5;
        
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        
        while (goal > 0) {
            if (bigCount > 0 && goal >= 5) {
                goal -= 5;
                bigCount -= 5;
            }
            else if (smallCount > 0) {
                goal -= 1;
                smallCount -= 1;
            }
            else {
                break;
            }
        }
        return goal == 0;
        
    }
}
