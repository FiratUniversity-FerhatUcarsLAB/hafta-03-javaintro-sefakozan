public class DaireHesap {
    public static void main(String[] args) {
        double r = 5.5, pi = 3.1415;
        double area, perimeter;
        area = pi * r * r;
        perimeter = 2 * pi * r;

        System.out.printf("Yarıçapı: %.1f olan dairenin: (pi = 3.1415)\n",r);
        System.out.printf("Alan: %.3f\n", area);
        System.out.printf("Cevre: %.3f\n", perimeter);
    }
}
