public class NumberPalindrome {
    // write code here
    public static boolean isPalindrome(int number) {
        if (number == 0) {
            return true;
        }
        else {
            int original = number;
            int reverse = 0;
            while (number != 0) {
                int lastDigit = number % 10;
                number = number / 10;
                reverse = (reverse * 10) + lastDigit;
            }
            if (original == reverse) {
                return true;
            }
            else return false;
        }
    }
}
