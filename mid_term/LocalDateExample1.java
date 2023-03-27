public class LocalDateExample1{
public static void main(String[] args)
{
    LocalDate date1  = LocalDate.now();
    System.out.println("Curent Date of my System:- " +date1);
    LocalDate date = LocalDate.of(2017,2,13);
    System.out.println("of method: " +date);

    date=LocalDate.of(2017,Month.MARCH,13);
    System.out.println("of method: "+ date);

    LocalDate yesterday = date1.minusDays(1);
    LocalDate tomorrow = yesterday.plusDays(2);
    System.out.println("Todaydate: "+ date);
    System.out.println("Yesterday date: " +yesterday);
    System.out.println("Tomorrow date: " +tomorrow);
    System.out.println(date.isLeapYear());
    date1 = LocalDate.parse("2017-02-28");
    System.out.println("parse method: "+ date1);

}
}