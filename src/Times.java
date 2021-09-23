import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Times {
    public static void main(String[] args) throws ParseException {
        //第一代时间类 Date
        Date date = new Date();
        System.out.println(date);
        //时间格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SS");
        //format 方法->String
        String str = sdf.format(date);
        System.out.println(str);
        //parse ->date
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        //第二代时间类 Calendar 没有格式转换方法
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        System.out.println(timeInMillis);
        calendar.getTime();
        System.out.println(calendar.getTime());

        //第三代时间类 Local Date Time
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //String format = ldt.format("yyyy-MM-dd HH:mm:ss:SS");
        System.out.println(ldt.getMonthValue());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SS");
        String format = dateTimeFormatter.format(ldt);
        System.out.println(format);
        System.out.println(ldt.getMonth());
    }
}
