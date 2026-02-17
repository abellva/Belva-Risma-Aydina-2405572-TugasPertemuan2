import java.util.Scanner;
import java.util.Locale;
public class no2Belva {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Apakah anda naik kelas? (true/false): ");
        boolean naikKelas = myObj.nextBoolean();

        System.out.println("Anda dapat ranking ke berapa? ");
        int ranking = myObj.nextInt();

        boolean hadiah = naikKelas && ranking == 1;
        
        System.out.println("Anda mendapatkan hadiah: " + hadiah);
        System.out.println("Naik kelas: " + naikKelas);
        System.out.println("Ranking: " + ranking);
    }
}
