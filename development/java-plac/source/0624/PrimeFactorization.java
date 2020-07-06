import java.util.Scanner;

public class PrimeFactorization {
	// 素因数分解
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();

		int[] factors = new int[30]; // 素因数のリスト
		int f_num = 0; // 素因数の個数
		f_num = factorize(n, factors, f_num);
		printFactors(factors, f_num);
	}

	private static int factorize(int n, int[] factors, int f_num) {
		int j = 2;
		while (n > j) {
			if (n % j == 0) {
				factors[f_num++] = j;
				n /= j;
			} else {
				j++;
			}
		}
		factors[f_num++] = n;
		return f_num;
	}

	private static void printFactors(int[] factors, int f_num) {
		for (int i = 0; i < f_num; i++) {
			System.out.print("×" + factors[i]);
		}
		System.out.println();
	}

}
