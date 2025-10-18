public class IkiIslem {
    public static void main(String[] args) {
        double pay = (9.5 * 4.5) - (2.5 * 3);
        double payda = 45.5- 3.5;

        double sonuc = pay / payda;

        // %.(sayi)f --> virgülden sonraki basamak sayısını belirtir
        System.out.printf("%.4f\n", sonuc);
    }
}
