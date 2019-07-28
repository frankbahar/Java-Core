import java.awt.desktop.SystemEventListener;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes, remainKiloBytes;
        megaBytes = kiloBytes / 1024;
        remainKiloBytes = kiloBytes/1024;
        if (kiloBytes >= 0)
            System.out.println(kiloBytes+" KB = " + megaBytes+ " MB and " + remainKiloBytes +" KB");
        else
            System.out.println("Invalid Value");
        }
}
