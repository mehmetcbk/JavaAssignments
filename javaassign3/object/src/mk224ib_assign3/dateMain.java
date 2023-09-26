package mk224ib_assign3;

public class dateMain {
    public static void main(String[] args) {
        DateFormat date=new DateFormat(2010, 4, 31, '/', 'b');
        DateFormat date1=new DateFormat(2016, 2, 29, '/', 'b');
        DateFormat date2 = new DateFormat(2015, 2, 29, '/', 'm');
        DateFormat date3 = new DateFormat(2014, 2, 29, '/', 'l');
        DateFormat date4 = new DateFormat(2020, 2, 29, '/', 'l');
        DateFormat date5 = new DateFormat(1900, 2, 30, '-', 'b');

        System.out.println(date.getDate(false));
        System.out.println(date1.getDate(true));
        System.out.println(date2.getDate(false));
        System.out.println(date3.getDate(true));
        System.out.println(date4.getDate(false));
        System.out.println(date5.getDate(true));

    }
}
