public class FirstLastDigitSum {
    // write code here
    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int digit = 0;
            int sum = number % 10;
            do {
                digit = number % 10;
                number = number / 10;
            } while (number != 0);
            sum += digit;
            return sum;
        }
        else return -1;
    }
}
