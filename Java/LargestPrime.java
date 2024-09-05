public class LargestPrime {
    // write code here
    public static int getLargestPrime(int number) {
        
        if (number <= 1) return -1;
        
        int largest = -1;
        
        // loop for choosing divisor
        for (int i = 2; i <= number; i++) {
            int count = 0;
            
            if (number % i == 0) {
                // loop for checking if divisor is a prime
                for (int j = 1; j <= i; j++) {
                    // here we check how many divisors a divisor has
                    if (i % j == 0) {
                        count++;
                    }
                }
                // if it has 2 divisors it is a prime and we count it as highest
                if (count == 2) {
                    largest = i;
                }
            }
        }
        return largest;
    }
}
