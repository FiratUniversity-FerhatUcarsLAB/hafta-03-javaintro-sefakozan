import java.util.Scanner;

public class SaatDonusturme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saniye giriniz: ");
        int saniye = scanner.nextInt();

        int saat = saniye / 3600; // ondalıklı bir sayı çıkarsa sadece tam kısmı saat değişkenine atanır
        int kalanSaniyeler = saniye % 3600; // saatten kalan saniyeler
        int dakika = kalanSaniyeler / 60; // saatten kalan saniyelerden dakikayı bulmak
        int kalanSaniye = kalanSaniyeler % 60; // saatten kalan saniyelerin 60'a bölümünden kalan saniyeler

        System.out.printf("%d:%d:%d",saat, dakika,kalanSaniye);
    }
}