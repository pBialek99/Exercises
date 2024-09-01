public class LengthConversion {
  
  public static double convertToCentimeters(int height) {
    return (double) (height * 2.54d);
  } 

  public static double convertToCentimeters(int feet, int inches) {
    return (double) ((feet * 12 + inches) * 2.54d);
  }
}
