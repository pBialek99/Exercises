public class PerfectNumber {
    // write code here
    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        
        int div = 1;
        int sum = 0;
        
        while (div < number) {
            if (number % div == 0) {
                sum += div;
            }
            div++;
        }
        if (sum == number) return true;
        
        return false;
    }
}
