public class GreatestCommonDivisor {
    // write code here
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        else {
            int i = 1;
            int x = 1;
            int y = 1;
            int common = 1;
            
            while (i <= first && i <= second) {
                if (first % i == 0) x = i;
                if (second % i == 0) y = i;
                if (x == y) common = x;
                i++;
            }
            return common;
        }
    }
}
