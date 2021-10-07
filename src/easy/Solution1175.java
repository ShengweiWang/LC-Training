package easy;

/**
 * Created by Shengwei_Wang on 6/24/21.
 *
 * v1 10:10
 */
public class Solution1175 {
    public static final int modulo = 1000000007;
    public int numPrimeArrangements(int n) {
        int numOfPrimes = getNumOfPrimes(n);

        long result = 1;
        for (int i = (n - numOfPrimes); i > 0; --i) {
            result = result * i % modulo;
        }
        for (int i = numOfPrimes; i > 0; --i) {
            result = result * i % modulo;
        }
        return (int) result;
    }
    private int getNumOfPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; ++i) {
            count += isPrime(i);
        }
        return count;
    }
    private int isPrime(int n) {
        if (n == 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); ++i){
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
