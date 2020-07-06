public class DiceCount {
    private static final int X = 6;

    public static void main(String[] args) {
        IkasamaDice d = new IkasamaDice(X);
        int[] count = new int[X + 1];

        for (int i = 0; i < 100000; i++) {
            int n = d.cast();
            count[n]++;
        }
        for (int j = 1; j <= 6; j++) {
            System.out.println(j + ":" + count[j]);
        }
    }
}