import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        System.out.print("Faktoriyeli almak istedigin sayi: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }

        System.out.printf("%d!: %d\n",num, res);
        System.out.printf("Recursive Factorial: %d", recFact(num));
    }

    // Recursive Factorial
    public static int recFact(int num){
        if (num == 0)
            return 1;
        return num * recFact(num - 1); // rf(6) = 6 * rf(5) = 6 * 5 * rf(4) = 6 * 5 * 4 * rf(3)...
    }
}


