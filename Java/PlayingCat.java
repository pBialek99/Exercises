public class PlayingCat {
    // write code here
    public static boolean isCatPlaying(boolean summer, int temperature) {
        return (temperature >= 25 && temperature <= 35) ? true : ((summer) ? ((temperature >= 25 && temperature <= 45) ? true : false) : false);
    }
}
