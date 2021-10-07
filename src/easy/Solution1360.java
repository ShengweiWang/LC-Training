package easy;

/**
 * Created by Shengwei_Wang on 6/22/21.
 */
public class Solution1360 {
    int[] monthDates = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int daysBetweenDates(String date1, String date2) {
        if (date1.compareTo(date2) > 0) {
            return daysBetweenDates(date2, date1);
        }
        int diff = - dateOfYear(date1) + dateOfYear(date2);
        for(int i = Integer.valueOf(date1.substring(0, 4)); i < Integer.valueOf(date2.substring(0, 4)); ++i) {
            if(leap(i)) {
                diff += 366;
            } else {
                diff += 365;
            }
        }
        return diff;
    }

    public int dateOfYear(String date) {
        int result = 0;
        String[] splits = date.split("-");
        int month = Integer.valueOf(splits[1]) - 1;
        for (int i = 0; i < month; ++i) {
            result += monthDates[i];
            if (i == 1 && leap(Integer.valueOf(splits[0]))) {
                result += 1;
            }
        }
        return result + Integer.valueOf(splits[2]);
    }

    public boolean leap(int n) {
        return n% 400 == 0 || (n% 100 != 0 && n % 4 == 0);
    }
}
