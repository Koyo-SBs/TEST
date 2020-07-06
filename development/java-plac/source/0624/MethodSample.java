public class MethodSample {
    public static void main(String[] args) {
        int result = add(1, 2);
        System.out.println("結果：" + result);
    }

    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}