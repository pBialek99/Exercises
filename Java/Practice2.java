public class Practice2 {
    public static void main(String[] args) {

        int firstV = 10;
        int secondV = 20;
        boolean thirdV = true;
        boolean fourthV = false;

        if (firstV >= secondV && thirdV) {
            System.out.println("First variable is equal or greater than second variable.\n");
        }
        else System.out.println("Second variable is greater than first variable.\n");

        if (thirdV || fourthV) {
            System.out.println("At least one variable is true.\n");
        }

        // Ternary operator check
        String stringV_1 = "This is string 1";
        boolean check = stringV_1 == "This is string 1" ? true : false;
        System.out.println(check);

        // Exercise 1
        System.out.println("\nThis is exercise part!\n");
        double var_1 = 20.00d;
        double var_2 = 80.00d;
        double var_3 = (var_1 + var_2) * 100.00d;
        double remainder = var_3 % 40.00d;
        boolean remainder_check = remainder == 0.00d ? true : false;
        System.out.println("Is our reminder equal to 0.00?\t" + remainder_check + "\n");
        if (!remainder_check) {
            System.out.println("Got some remainder!");
        }

        // Exercise 2
        methodOne();

        // Exercise 3
        double score = 1500.00d;
        System.out.println("Calculated highscore for score = " + score + " is: " + calculateHighScorePosition(score) + "\n");
        score = 1000.00d;
        System.out.println("Calculated highscore for score = " + score + " is: " + calculateHighScorePosition(score) + "\n");
        score = 500.00d;
        System.out.println("Calculated highscore for score = " + score + " is: " + calculateHighScorePosition(score) + "\n");
        score = 100.00d;
        System.out.println("Calculated highscore for score = " + score + " is: " + calculateHighScorePosition(score) + "\n");
        score = 25.00d;
        System.out.println("Calculated highscore for score = " + score + " is: " + calculateHighScorePosition(score) + "\n");


    }
    public static void methodOne() {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore + "\n");
        }
    }

    public static int calculateHighScorePosition(double playerScore) {
        if (playerScore >= 1000) {return 1;}
        else if (playerScore >= 500 && playerScore < 1000) {return 2;}
        else if (playerScore >= 100 && playerScore < 500) {return 3;}
        else return 4;
    }
}
