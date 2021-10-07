package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 11:40, firstly wrong with details
 */
public class Solution1716 {
    public int totalMoney(int n) {
        int cycles = (n - 1) / 7;
        int index = (n - 1) % 7 + 1;
        int base = (1 + 7) * 7 / 2;
        int sum = (cycles - 1) * cycles / 2 * 7 + base * cycles;
        sum += cycles * index + (1 + index) * index / 2;
        return sum;
    }

}
