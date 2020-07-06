import java.util.Scanner;

public class StringEquals
{

    public static void main(String[] args) {
        System.out.println("パスワードを入力してください：");
        Scanner s= new Scanner(System.in);
        String passwd=s.nextLine();
        s.close();

        if(passwd.equals("hoandai")){
            System.out.println("OK!");
        }else{
            System.out.println("NG!");
        }
    }
}