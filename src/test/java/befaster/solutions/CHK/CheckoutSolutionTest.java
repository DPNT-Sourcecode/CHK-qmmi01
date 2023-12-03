package befaster.solutions.CHK;

import befaster.solutions.HLO.HelloSolution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutSolutionTest {

    private CheckoutSolution chk;

    @BeforeEach
    public void setUp() {
        chk = new CheckoutSolution();
    }

    @Test
    public void testOk() {
        assertEquals(445, chk.checkout("AAAAAAABBBCCC"));
    }

    @Test
    public void testIllegalArgument_V1() {
        assertEquals(-1, chk.checkout(null));
    }

    @Test
    public void testIllegalArgument_V2() {
        assertEquals(-1, chk.checkout(""));
    }

    @Test
    public void testIllegalArgument_V3() {
        assertEquals(-1, chk.checkout("  "));
    }


}



