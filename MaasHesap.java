import java.util.Scanner;
import java.util.Locale;

public class MaasHesap {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            
            // Kullanıcı Bilgileri
            System.out.print("Lütfen adınızı girin: ");
            String ad = scanner.nextLine();
            System.out.print("Lütfen soyadınızı girin: ");
            String soyad = scanner.nextLine();
            System.out.print("Lütfen aylık brüt maaşınızı giriniz: ");
            double brutMaas = scanner.nextDouble();
            System.out.print("Haftalık çalışma saatinizi giriniz: ");
            int calismaSaati = scanner.nextInt();
            System.out.print("Lütfen kaç saat mesai yapacağınızı giriniz: ");
            int mesaiSaati = scanner.nextInt();

            // Sabitler
            final double SGK_ORANI = 0.14;
            final double GELIR_VERGISI_ORANI = 0.15;
            final double DAMGA_VERGISI_ORANI = 0.00759;
            final double MESAI_KATSAYISI = 1.5;
            final int AYLIK_STANDART_SAAT = 160;

            // Hesaplamalar
            double mesaiUcreti = (brutMaas / AYLIK_STANDART_SAAT) * mesaiSaati * MESAI_KATSAYISI;
            double toplamGelir = brutMaas + mesaiUcreti;
            double sgkKesinti = toplamGelir * SGK_ORANI;
            double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
            double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
            double toplamKesinti = sgkKesinti + gelirVergisi + damgaVergisi;
            double netMaas = toplamGelir - toplamKesinti;

            // Bordro Çıktısı
            System.out.println("\n========================================");
            System.out.println("           MAAS BORDROSU");
            System.out.println("========================================");
            System.out.println("Calisan: " + ad + " " + soyad);
            System.out.println();
            
            System.out.println("GELIRLER:");
            System.out.printf("  Brut Maas                : %.2f TL\n", brutMaas);
            System.out.printf("  Mesai Ucreti (%d saat)  : %.2f TL\n", mesaiSaati, mesaiUcreti);
            System.out.println("  -------------------------");
            System.out.printf("  TOPLAM GELIR             : %.2f TL\n", toplamGelir);
            System.out.println();
            
            System.out.println("KESINTILER:");
            System.out.printf("  SGK Kesintisi (%.1f%%)    : %.2f TL\n", SGK_ORANI * 100, sgkKesinti);
            System.out.printf("  Gelir Vergisi (%.1f%%)    : %.2f TL\n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
            System.out.printf("  Damga Vergisi (%.1f%%)     : %.2f TL\n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
            System.out.println("  -------------------------");
            System.out.printf("  TOPLAM KESINTI           : %.2f TL\n", toplamKesinti);
            System.out.printf("  NET MAAS                 : %.2f TL\n", netMaas);
            System.out.println("========================================");

        } 
    }
}
