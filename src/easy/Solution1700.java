package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 11:40, firstly wrong.
 */
public class Solution1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for (int student : students) {
            ++count[student];
        }
        for (int sandwich : sandwiches) {
            if (--count[sandwich] < 0) {
                return count[1 - sandwich];
            }
        }
        return 0;
    }
}
