import java.util.Scanner;
import java.util.Locale;
public class no3Belva {
    public static void main (String[] args){
        Scanner myObj = new Scanner (System.in).useLocale(Locale.US);
        char hurufA = 'A';
        char hurufB = 'B';

        int ASCII1 = (int) hurufA;
        int ASCII2 = (int) hurufB;
        
        System.out.println("Nilai ASCII A = " + ASCII1);
        System.out.println("Nilai ASCII B = " + ASCII2);
        System.out.println("Hasil penjumlahannya adalah: " + (ASCII1 + ASCII2));

    }
}
