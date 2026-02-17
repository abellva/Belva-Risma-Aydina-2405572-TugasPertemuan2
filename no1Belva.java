import java.util.Scanner;
import java.util.Locale;
public class no1Belva {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in).useLocale(Locale.US);
        float a = myObj.nextFloat();
        float b = myObj.nextFloat();
        float c = myObj.nextFloat();

        System.out.println("a: " + a);
        System.out.println("b: " +b);
        System.out.println("c: " +c);

        System.out.println("Hasil Tambah = " + (a + b + c));
        System.out.println("Hasil Kurang = " + (a - b - c));
        System.out.println("Hasil Kali = " + (a * b * c));
        System.out.println("Hasil Bagi = " + (a / b / c));
   } 
}
