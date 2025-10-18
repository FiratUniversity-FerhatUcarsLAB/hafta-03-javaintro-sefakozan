import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        System.out.println(
                "----------| Bilgilendirme |----------\n" +
                "...  < 18.5 arasındaki değer zayıf kilolu.\n" +
                "18.5 - 24.9 arasındaki değer normal kilolu.\n" +
                "25.0 - 29.9 arasındaki değer fazla kilolu.\n" +
                "30.0 - 34.9 arasındaki değer 1. derece obezite.\n" +
                "35.0 - 39.9 arasındaki değer 2. derece obezite (aşırı obez).\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyunuz (metre): ");
        double boy = scanner.nextDouble();

        System.out.print("Kilonuz: ");
        double kilo = scanner.nextDouble();

        double bmi = kilo / (boy * boy);

        System.out.printf("Vucut Kitle Indeksi (BMI): %.2f", bmi);
    }
}