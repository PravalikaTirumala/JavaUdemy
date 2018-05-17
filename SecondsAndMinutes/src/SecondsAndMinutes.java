/**
 * method overloading :
 */
public class SecondsAndMinutes {
    public static void main(String[] args) {

        System.out.println(getDurationString(61, 00));
        System.out.println(getDurationString(3945));
    }

    private static String getDurationString(long minutes, long seconds) {
        long hours = 0;
        long mins = 0;
        long secs = 0;
        // String res = null;
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return "Invalid value";
        } else {
            if (minutes == 60) {
                hours = 1;
            } else if (minutes < 60) {
                hours = 0;
            } else {
                hours = minutes / 60;
                mins = minutes % 60;
            }

        }
        return  hours + "h " + mins + "m " + secs + "s ";

    }

    private static String getDurationString(long seconds) {
        if(seconds < 0){
            return "Invalid value";
        }
        long minutes = seconds /60;
        long remSecs = seconds % 60;
        return getDurationString(minutes,remSecs);

    }
}