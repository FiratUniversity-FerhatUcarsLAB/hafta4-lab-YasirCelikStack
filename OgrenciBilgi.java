/*
 * Ad Soyad: Muhammet Yasir Çelik
 * Ogrenci No: 250542010
 * Tarih: 26.10.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;
import java.util.Locale; // 1. Locale sınıfını import edin

public class OgrenciBilgi{

    public static void main(String[] args) {
        
        // 2. Scanner'ı Locale.US ayarıyla başlatın.
        // Bu, ondalıklı sayılarda her zaman nokta (.) kabul etmesini sağlar.
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            // --- GİRİŞ BÖLÜMÜ ---
            System.out.println("=== OGRENCI BILGI SISTEMI ===");
            
            System.out.print("Adinizi girin: ");
            String ad = scanner.nextLine();

            System.out.print("Soyadinizi girin: ");
            String soyad = scanner.nextLine();

            System.out.print("Ogrenci numaraniz: ");
            int ogrenciNo = scanner.nextInt();

            System.out.print("Yasiniz: ");
            int yas = scanner.nextInt();

            System.out.print("GPA (0.00-4.00): ");
            double gpa = scanner.nextDouble();  

            // --- DURUM BELİRLEME ---
            String durum;
            if (gpa >= 2.00) {
                durum = "Basarili Ogrenci";
            } else {
                durum = "Basarisiz Ogrenci";
            }

            // --- ÇIKIŞ BÖLÜMÜ ---
            System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
            System.out.println("Ad Soyad: " + ad + " " + soyad);
            System.out.println("Ogrenci No: " + ogrenciNo);
            System.out.println("Yas: " + yas);
            System.out.println("GPA: " + gpa);
            System.out.println("Durum: " + durum);

        } 
    }
}
        
    }
}
