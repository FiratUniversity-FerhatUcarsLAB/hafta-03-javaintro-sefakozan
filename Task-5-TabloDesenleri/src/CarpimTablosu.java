public class CarpimTablosu {
    public static void main(String[] args) {
        int i, j; // foo, bar olarakta isimlendirilebilir (kültür)

        for (i = 1; i <= 10; i++)
        {
            // üst taraf başlangıç sayılarını yazdırır
            if (i == 1) {
                System.out.println("KOZAN   1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
            }

            // sol taraf başlangıç sayılarını yazdırır
            System.out.printf(" %3d\t", i);

            // çarpımları yazdırır
            for (j = 1; j <= 10; j++)
            {
                System.out.printf("%d\t", i * j);
            }
            // satırda 1-10 arası yazıldıktan sonra alt satıra geçer
            // 2 den başlar (2*1) 2. sütunda (2*2) olur
            System.out.println();
        }
    }
}
