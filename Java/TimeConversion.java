public class TimeConversion {
    
  public static String getDurationString(int seconds) {
    if (seconds < 0) {
      return "Invalid value";
    }

    int minutes = seconds / 60;
    seconds = seconds % 60;

    return getDurationString(minutes, seconds);
  }
  
  public static String getDurationString(int minutes, int seconds) {
    if (minutes < 0 || seconds < 0 || seconds >= 60) {
        return "Invalid value";
    }

    int hours = minutes / 60;
    minutes = minutes % 60;

    return hours + "h " + minutes + "m " + seconds + "s";
  }
}
