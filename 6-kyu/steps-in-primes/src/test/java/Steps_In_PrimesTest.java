import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Steps_In_PrimesTest {
    @Test
    public void test() {
        assertEquals("[101, 103]", Arrays.toString(Steps_In_Primes.step(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(Steps_In_Primes.step(4,100,110)));
        assertEquals("[101, 107]", Arrays.toString(Steps_In_Primes.step(6,100,110)));
        assertEquals("[359, 367]", Arrays.toString(Steps_In_Primes.step(8,300,400)));
    }
}