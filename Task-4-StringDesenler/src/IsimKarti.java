public class IsimKarti {
    public static void main(String[] args) {
        String ad = "Muhammet Sefa";
        String soyad = "KOZAN";
        String ogrNo = "250541057";
        String bolum = "Yazılım Muhendisligi";

        System.out.println("|----------------------------------------|");
        System.out.println("|           OGRENCI BILGILERI            |");
        System.out.println("|----------------------------------------|");
        System.out.printf("| İsim         : %s", ad    + " ".repeat(11) + "|\n");
        System.out.printf("| Soyisim      : %s", soyad + " ".repeat(19) + "|\n");
        System.out.printf("| Öğrenci No   : %s", ogrNo + " ".repeat(15) + "|\n");
        System.out.printf("| Bölüm        : %s", bolum + " ".repeat(4) + "|\n");
        System.out.println("|----------------------------------------|");
        System.out.println("|           Fırat Üniversitesi           |");
        System.out.println("|----------------------------------------|");
    }
}