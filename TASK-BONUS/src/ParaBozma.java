import java.util.Scanner;

public class ParaBozma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Para Miktarı: ");
        int miktar = scanner.nextInt();

        int kalan;
        int yuz = miktar / 100; // miktarın içindeki 100 tl sayısı
        kalan = miktar % 100; // 100 den kalan para sayısı
        int elli = kalan / 50; // kalan paradan 50 tl sayısı
        kalan = kalan % 50; // 50 den kalan para sayısı
        int yirmi = kalan / 20; // kalan paradan 20 tl sayısı
        kalan = kalan % 20; // 20 den kalan para sayısı
        int on = kalan / 10; // kalan paradan 10 tl sayısı
        kalan = kalan % 10; // 10 dan kalan para sayısı
        int bes = kalan / 5; // kalan paradan 5 tl sayısı
        kalan = kalan % 5; // 5 den kalan para sayısı
        int bozuk = kalan;

        System.out.printf("%d TL = %dx100TL, %dx50TL, %dx20TL, %dx10TL, %dx5TL, %dx1TL", miktar, yuz, elli, yirmi, on, bes, bozuk);
    }
}