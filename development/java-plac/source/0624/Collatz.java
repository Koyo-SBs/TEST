import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(n);
        while (n != 1) {
            n = next(n);
            System.out.println(" " + n);
        }
        System.out.println();
    }

    static int next(int n) {

        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = n * 3 + 1;
        }
        return n;
    }
}