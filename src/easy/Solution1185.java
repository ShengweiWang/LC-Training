package easy;

/**
 * Created by Shengwei_Wang on 6/24/21.
 *
 * v1 15:42 details!!
 */
public class Solution1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        int[] months = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        // Calculate days from base
        //1971 01 01
        int days = 4;
        // year
        for(int i = 1971; i < year; ++i) {
            days += isPrime(i) ? 366: 365;
        }
        // month
        for(int i = 1; i < month; ++i) {
            days += (i == 2 && isPrime(year) ? months[i - 1] + 1: months[i - 1]);
        }
        days += day;

        return week[days % 7];
    }
    private boolean isPrime(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }
}
