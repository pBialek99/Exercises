public class NumberToWords {
    //  write code here
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        
        if (number == 0) {
            System.out.println("Zero");
            return;
        }
        
        int originalDigitCount = getDigitCount(number);
        number = reverse(number);
        int reversedDigitCount = getDigitCount(number);

        while (number > 0) {
            int div = number % 10;
            number = number / 10;

            switch (div) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }

        while (originalDigitCount > reversedDigitCount) {
            System.out.println("Zero");
            reversedDigitCount++;
        }
    }

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number == 0) return 1;

        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
}
