import java.util.Scanner;

public class InputCalculator {
    // write code here
    public static void inputThenPrintSumAndAverage() {
        
        Scanner intScanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        
        boolean check = true;

        while (check) {
            String var = intScanner.nextLine();
            
            try {
                int number = Integer.parseInt(var);
                count++;
                sum += number;
                
            }
            catch(Exception e) {
                check = false;
            }
            
        }
        long avg = Math.round(((double) (sum / (double) count)));
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
