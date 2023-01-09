
public class DateConstructorDemo
{
    public static void main(String[] args)
    {
        Date date1 = new Date("December", 16, 1770),
             date2 = new Date(1, 27, 1756);
             if (date1.equals(date2))
                 System.out.println(date1 + " equals " + date2);
             else
                 System.out.println(date1 + " does not equal " + date2);

            

             if (date1.precedes(date2))
                 System.out.println(date1 + " comes before " + date2);
             else
                 System.out.println(date2 + " comes before or is equal to " 
                                          + date1);
}}
