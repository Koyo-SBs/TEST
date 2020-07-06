public class PrimeSieve {
    public static void main(final String[] args) {
        final int N = 10000;
        boolean[] n = new boolean[N];
        for (int i = 0; i < n.length; i++) {
            n[i] = true;
        }
        n[0] = false;
        n[1] = false;

        for (int p = 2; p < N; p++) {
            // 下から数えて初めて出る素数はtrueのままでその倍数はfalseになるため、総数かどうかの判定は不要
            if (n[p] == true) {
                System.out.println(" " + p);
                for (int j = 2; j * p < N; j++) {
                    n[j * p] = false;
                }
            }
        }
    }
}