import java.time.LocalTime;
public class LocalTimeExample3
{
    public static void main(String[] args){
        LocalTime time4 = LocalTime.now();
        System.out.println(time4);
        LocalTime time1 = LocalTime.of(10,43,23);
        System.out.println(time1);
        LocalTime time2 = time1.minusHours(2);
        LocalTime time3 = time2.minusMinutes(34);
        System.out.println(time3);
        time2=LocalTime.parse("10:23:45.189");

        System.out.println("parse:"+time2);
    }
}