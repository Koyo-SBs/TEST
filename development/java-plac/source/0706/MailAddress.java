public class MailAddress {
    public static void main(String[] args) {
        String address="ohkubo.k97sz@ascsys.onmicrosoft.com";

        String user=address.substring(0,address.indexOf('@'));
        String domain=address.substring(address.indexOf('@')+1);

        System.out.println(user);
        System.out.println(domain);
    }
}