import java.util.Random;

public class RandomSample {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int d = r.nextInt(6) + 1;//0以上6未満の乱数+1＝サイコロ
            System.out.println(d);
        }
    }
}