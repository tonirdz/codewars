public class Palindrome_Chain_Length {
    public static int palindromeChainLength (long n) {
        int i = 0;
        while(true) {
            String nstring = String.valueOf(n);
            String rnstring = new StringBuilder(nstring).reverse().toString();
            if (rnstring.equals(nstring)) return i;
            n = n + Long.parseLong(rnstring);
            i++;
        }
    }
}
