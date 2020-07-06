import java.util.Random;

public class IkasamaDice {

    private Random r;
    private int n;

    public IkasamaDice() {
        this(6);
    }

    public IkasamaDice(int n) {
        r = new Random();
        this.n = n;
    }

    public int cast() {
        int x=r.nextInt(n+1);//７面のサイコロ(0~6)
        if(x==0){//0が出たら1にする＝１が二面ある
            x=1;
        }
        return x;
    }
}
