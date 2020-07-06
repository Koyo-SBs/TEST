public class Fibonacci {
    public static void main(String[] args) {
        int[] a;
        a = new int[7];
        a[0] = 0;
        a[1] = 1;

        for (int i = 2; i < a.length; i++) {
            a[i] = a[i - 2] + a[i - 1];
            System.out.println("a[" + i + "]=" + a[i]);
        }

    }
}