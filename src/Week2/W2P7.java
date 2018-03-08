package Week2;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class W2P7 {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        long x = scanner.nextLong();

        gregorianCalendar.setTimeInMillis(x);

        int day = gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH);
        int month = gregorianCalendar.get(gregorianCalendar.MONTH);
        int year = gregorianCalendar.get(gregorianCalendar.YEAR);

        System.out.format("%02d/%02d/%02d", day, month+1, year);
    }

}