public class UsluSayilarTablosu {
    public static void main(String[] args) {
        System.out.println(" a    | a^2  | a^3  ");
        System.out.println("-".repeat(23));

        int kare, kup;
        for (int a = 1; a <= 5; a++) {
            kare = a * a;
            kup = a * a * a;
            System.out.printf(" %-4d | %-4d | %-4d\n", a, kare, kup);
        }
    }
}
