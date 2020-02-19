
//7. WAP to convert seconds into days, hours, minutes and seconds.
package java2;

public class ConvertSeconds {
    static void Convert(int n)
    {
        int day = n / (24 * 3600);

        n = n % (24 * 3600);
        int hour = n / 3600;

        n %= 3600;
        int minutes = n / 60 ;

        n %= 60;
        int seconds = n;

        System.out.println( day + " " + "days " + hour
                + " " + "hours " + minutes + " "
                + "minutes " + seconds + " "
                + "seconds ");
    }


    public static void main (String[] args)
    {
        // Given n is in seconds
        int n = 3696754;
        Convert(n);

    }
}
