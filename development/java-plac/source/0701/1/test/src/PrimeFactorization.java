import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        FactorList f = new FactorList(n);
        f.print();
    }

}