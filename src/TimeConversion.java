import java.util.*;
import java.text.*;
public class TimeConversion
{
    public static void main(String[] args)
    {
        String Format="dd-M-yyyy hh:mm:ss";
        SimpleDateFormat dateformat=new SimpleDateFormat(Format);
        Date dt=new Date();
        Calendar cal=new GregorianCalendar();
        cal.setTime(dt);

        System.out.println("Date:"+dateformat.format(cal.getTime()));
        System.out.println("TimeZone:"+cal.getTimeZone().getID());
        System.out.println("TimeZone name:"+cal.getTimeZone().getDisplayName());

        TimeZone j=TimeZone.getTimeZone("Africa/Johannesburg");
        SimpleDateFormat jformat =new SimpleDateFormat(Format);
        jformat.setTimeZone(j);
        cal.setTimeZone(j);

        System.out.println("After Conversion:");
        System.out.println("Date:"+jformat.format(cal.getTime()));
        System.out.println("TimeZone:"+cal.getTimeZone().getID());
        System.out.println("TimeZone name:"+cal.getTimeZone().getDisplayName());



    }
}