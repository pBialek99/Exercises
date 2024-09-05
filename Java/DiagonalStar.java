public class DiagonalStar {
    // write code here
    public static void printSquareStar(int number) {
        
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        else {
            // row
            for (int i = 1; i <= number; i++) {
                // col
                for (int j = 1; j <= number; j++) {
                    // printing top or bottom
                    if (i == 1 || i == number) {
                        System.out.print("*");
                    }
                    // printing beggining or end
                    else if ((i != 1 || i != number) && (j == 1 || j == number)) {
                        System.out.print("*");
                    }
                    // printing inner left
                    else if (i == j) {
                        System.out.print("*");
                    }
                    // printing inner right
                    else if (j == (number - i) + 1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            } 
        }
        
    }
}
