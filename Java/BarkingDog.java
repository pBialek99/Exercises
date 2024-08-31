public class BarkingDog {
     // write code here
     public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
         return (hourOfDay >= 0 && hourOfDay <= 23) ? ((barking && (hourOfDay < 8 || hourOfDay > 22)) ? true : false) : false;
     }
}
