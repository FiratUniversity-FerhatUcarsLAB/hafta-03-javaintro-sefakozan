public class MilKilometreTablosu {
    public static void main(String[] args) {
        // 1 mil = 1.609 km
        double milToKm = 1.609;
        int[] milDegerleri = {1, 5, 10, 20, 50};

        System.out.println(" Mil  | Kilometre ");
        System.out.println("-".repeat(23));

        // milDegerleri icindeki degerler mil degiskenine atılır ve tum dizi gezilir
        for (int mil : milDegerleri) {
            double kilometre = mil * milToKm;
            System.out.printf(" %-4d | %.2f%n", mil, kilometre);
        }
    }
}
