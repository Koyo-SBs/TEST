public class PrimeList {

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        for (int n = 2; n < 100000; n++) {
            if (isPrime(n)) {//isPrime(n)==true
                System.out.println(n);
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println("time:" + (time2 - time1) + "ms");
    }
}