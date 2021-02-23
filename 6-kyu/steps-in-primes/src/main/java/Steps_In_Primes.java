import java.util.ArrayList;
import java.util.List;

public class Steps_In_Primes {
    public static long[] step(int g, long m, long n) {
        List<Integer> primes = prime_soe_range((int) m, (int) n);
        for(Integer a : primes) {
            if (primes.contains(a+g)) return new long[]{a,a+g};
        }
        return null;
    }

    private static List<Integer> prime_soe_range(int m, int n) {
        boolean[] isPrime = new boolean[n + 1];
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                if ((i >= m) && (i <= n)) primes.add(i);
                for (long j = i; j * i <= n; j++) {
                    if ((j * i) <= n) isPrime[i * (int)j] = false;
                }
            }
        }
        return primes;
    }
}
