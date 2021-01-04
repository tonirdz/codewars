package _5kyu;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Factorial_Decomposition {
    public static String decomp(int n) {
        StringJoiner sj = new StringJoiner(" * ");
        List<Integer> primes = prime_soe(n);

        for (Integer prime: primes) {
            int exp = 0;
            for(int x = n; x >= prime; x /= prime) exp += x / prime;
            if (exp == 1) sj.add(prime.toString());
            else if (exp != 0) sj.add(prime.toString() + "^" + exp);
        }
        return sj.toString();
    }

    private static List<Integer> prime_soe(int n) {
        boolean[] isPrime = new boolean[n + 1];
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
                for (int j = i; j * i <= n; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        return primes;
    }

}