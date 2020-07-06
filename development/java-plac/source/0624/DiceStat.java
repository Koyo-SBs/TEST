import java.util.Random;

public class DiceStat {
    public static void main(String[] args) {
        final int N=6;
        Random rand = new Random();
        int[]d=new int[N];
        /*int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;*/
        for (int i = 0; i < 10000; i++) {
            int dice = rand.nextInt(N);
            d[dice]++;
            /*if (dice == 0) {
                one++;
            } else if (dice == 1) {
                two++;
            } else if (dice == 2) {
                three++;
            } else if (dice == 3) {
                four++;
            } else if (dice == 4) {
                five++;
            } else if (dice == 5) {
                six++;
            }*/
        }
        /*System.out.println("1:" + one);
        System.out.println("2:" + two);
        System.out.println("3:" + three);
        System.out.println("4:" + four);
        System.out.println("5:" + five);
        System.out.println("6:" + six);*/
        for(int j=0;j<6;j++){
            System.out.println(j+1 + ":" + d[j]);
        }
    }
}