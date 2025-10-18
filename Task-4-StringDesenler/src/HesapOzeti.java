/**
 *         // %-30s  --> %s ile yazdırır, sola hizalı şekilde sağa boşluk (s,d,f formatında olabilir)
 *         // %30s   --> %s ile yazdırır, sağa hizalı şekilde sola boşluk
 *         // %7.3f  --> 3.14159   --> Çıktı: [  3.141] 7 karakter (. dahili)
 *         // %-30.3f  --> 3.14159   --> Çıktı: [3.141`25 boşluk`] (. dahil)
 *         // %.3s   --> Merhaba   --> Çıktı: [Mer] ilk 3 karakter
 *         // %05d   --> 42        --> Çıktı: 00042
 *         // %,d    --> 1234567   --> 1,234,567
 *         // %+d    --> 42        --> +42
 */

public class HesapOzeti {
    public static void main(String[] args) {
        // Alışveriş listesi verileri
        String[] urunler = {"Elma", "Süt", "Ekmek", "Gevrek", "Yumurta", "Çay"};
        int[] miktar = {5, 2, 3, 1, 30, 1};
        double[] fiyat = {50, 120, 45, 120, 150, 200};

        // Tabloyu çiz
        System.out.println("-".repeat(40));
        System.out.println(" ".repeat(10) + "ALIŞVERİŞ LİSTESİ" + " ".repeat(10));
        System.out.println("-".repeat(40));
        System.out.println(" Ürün       | Miktar | Fiyat (TL) ");
        System.out.println("-".repeat(40));


        // Verileri tabloya yazdır
        for (int i = 0; i < urunler.length; i++) {
            // -10s ve -6d sola hizali şekilde sağa belirtilen sayı kadar boşluk koyar
            System.out.printf(" %-10s | %-6d | %.2f\n", urunler[i], miktar[i], fiyat[i]);
        }

        System.out.println("-".repeat(40));
    }
}