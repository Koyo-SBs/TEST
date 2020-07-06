public class Even {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n);
        while(n % 2 == 0) {
            n = n / 2;
            System.out.print(" " + n);
        }
        System.out.println();// 改行するため
    }

}