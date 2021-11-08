package javaexample62inheritance;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaExample62Inheritance {

    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar();

        // inherited methods (from Calendar class)
        int year = gc.get(Calendar.YEAR);
        int month = gc.get(Calendar.MONTH) + 1;
        int day = gc.get(Calendar.DAY_OF_MONTH);

        System.out.println("Date: " + year + " - " + month + " - " + day);

        int hour = gc.get(Calendar.HOUR);
        int minute = gc.get(Calendar.MINUTE);
        int second = gc.get(Calendar.SECOND);

        System.out.println("Time: " + hour + ":" + minute + ":" + second);

        System.out.println();

        // re-define (over-ride) method in the subclass
        gc.add(Calendar.YEAR, 3); // (void method) increment actual year with 3.
                                  // this method is in the superclass (Calendar), but
                                  // re-defined (over-ride) in the subclass (GregorianCalendar)
        year = gc.get(Calendar.YEAR);
        System.out.println("New date: " + year + " - " + month + " - " + day);

        System.out.println();

        // method is in subclass but it is not in superclass
        int myYear = 1994;
        boolean b = gc.isLeapYear(myYear);
        System.out.println("Year (" + myYear + ") is a leap year ? " + b);
        
        for (int i = 1995; i < 2001; i++) {
            System.out.println("Year (" + i + ") is a leap year ? " + gc.isLeapYear(i));
        }

    }

}
