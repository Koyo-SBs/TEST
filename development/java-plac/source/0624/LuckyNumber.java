import java.util.Random;

public class LuckyNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(10);//0~9までの乱数

        System.out.print("ラッキーナンバー： ");
        System.out.println(num);
    }

}