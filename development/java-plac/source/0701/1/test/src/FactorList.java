public class FactorList {
    int[] factor;
    int num;

    FactorList() {
        factor = new int[30];
        num = 0;// 素因数の個数
    }

    FactorList(int n) {
        this();
        factorize(n);
    }

    int factorize(int n) {
        int j = 2;
        while (n > j) {
            if (n % j == 0) {
                this.factor[this.num++] = j;
                n /= j;
            } else {
                j++;
            }
        }
        this.factor[this.num++] = n;
        return this.num;
    }

    void print() {
        for (int i = 0; i < num; i++) {
            if (i > 0) {
                System.out.print(" * ");
            }
            System.out.print(factor[i]);
        }
        System.out.println();
    }
}