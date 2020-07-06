import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatSample {
    public static void main(String[] args) {
        Date date = new Date();
        

        SimpleDateFormat df1 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss",Locale.JAPAN);
        SimpleDateFormat df3 = new SimpleDateFormat("yyyy年MM月dd日　aK時:mm分:ss秒",Locale.JAPAN);
        SimpleDateFormat df4 = new SimpleDateFormat("MMM d HH:MM:ss");
        SimpleDateFormat df5 = new SimpleDateFormat("dd/MMM/yyyy:HH:MM:ss Z");
        SimpleDateFormat df6 = new SimpleDateFormat("EEE MMM d HH:mm:ss z yyy",Locale.JAPAN);

        String text = df6.format(date);
        System.out.println(text);
    }
}
