import java.util.Random;

public class Dice {

    private Random r;
    private int n;

    public Dice() {
        this(6);
    }

    public Dice(int n) {
        r = new Random();
        this.n = n;
    }

    public int cast(int n) {
        n = this.n;
        return r.nextInt(n) + 1;
    }
}