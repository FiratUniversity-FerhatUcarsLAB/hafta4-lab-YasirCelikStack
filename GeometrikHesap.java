import java.util.Scanner;
import java.util.Locale;

public class GeometrikHesap {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            double pi = 3.1415;
            System.out.print("=== GEOMETRİK HESAPLAYICI === ");
            System.out.print("Daire Yarıçapını Giriniz : ");
            double yaricap = scanner.nextDouble();
            
            // Hesaplamalar
            double daireAlani = pi * yaricap * yaricap;
            double daireCevresi = 2 * pi * yaricap;
            double kureHacmi = (4.0/3.0) * pi * yaricap * yaricap * yaricap; // Düzeltildi!
            double kureYuzeyAlani = 4 * pi * yaricap * yaricap;
            
            System.out.println("SONUCLAR:");
            System.out.println("----------");
            System.out.println("Daire Alanı       : " + String.format("%.2f", daireAlani));
            System.out.println("Daire Çevresi     : " + String.format("%.2f", daireCevresi));
            System.out.println("Küre Hacmi        : " + String.format("%.2f", kureHacmi));
            System.out.println("Küre Yüzey Alanı  : " + String.format("%.2f", kureYuzeyAlani));

        } 
    }
}
