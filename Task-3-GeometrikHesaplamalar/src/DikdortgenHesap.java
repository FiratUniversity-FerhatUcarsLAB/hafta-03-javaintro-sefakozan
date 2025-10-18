public class DikdortgenHesap {
    public static void main(String[] args) {
        double length = 4.5, height = 7.9;
        double area = length * height;
        double perimeter = 2 * (length + height);

        System.out.printf("En = %.1f Boy = %.1f olan dikdörtgenin: \n", length, height);
        System.out.printf("Alan: %.2f\n", area);
        System.out.printf("Cevre: %.2f\n", perimeter);
    }
}
