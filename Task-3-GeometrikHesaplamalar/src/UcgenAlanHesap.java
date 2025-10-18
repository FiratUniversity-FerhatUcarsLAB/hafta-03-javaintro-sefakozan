import java.util.Scanner;

public class UcgenAlanHesap {
    public static void main(String[] args) {
        // Ucgenin Heron Formulu İle Alan Hesabı
        // s = (a + b + c) / 2
        // Alan = kok2[s(s-a) * (s-b) * (s-c)]

        double a, b, c;
        double area;
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        a = scanner.nextDouble();

        System.out.print("b = ");
        b = scanner.nextDouble();

        System.out.print("c = ");
        c = scanner.nextDouble();

        // Heron Formulu
        double u = (a + b + c) / 2;
        double base = (u * (u-a) * (u-b) * (u-c));
        area = Math.pow(base, 0.5);

        // Verilen sayılarla ucgen olusmuyorsa kod hata verir
        System.out.printf("Kenarları %.0f, %.0f, %.0f olan üçgenin alanı: %.1f", a, b, c, area);
    }
}
