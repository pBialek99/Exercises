public class MegaBytesConverter {
    // write code here
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0) System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes - (kiloBytes / 1024) * 1024 ) + " KB");
        else System.out.println("Invalid Value");
    }
}
