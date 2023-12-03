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
        /*
        assertEquals(435, chk.checkout("AAAAAAABBBCCC"));
        assertEquals(465, chk.checkout("AAAAAAABBBCCCFFFF"));
        assertEquals(475, chk.checkout("AAAAAAABBBCCCFFFFFF"));
        assertEquals(455, chk.checkout("AAAAAAABBBCCCFFF"));
        assertEquals(455, chk.checkout("AAAAAAABBBCCCFF"));
        assertEquals(445, chk.checkout("AAAAAAABBBCCCF"));
        assertEquals(837, chk.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        assertEquals(20, chk.checkout("W"));
        assertEquals(1602, chk.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        assertEquals(130, chk.checkout("AAA"));
        assertEquals(330, chk.checkout("AAAAAAAA"));
        assertEquals(280, chk.checkout("ABCDEABCDE"));
        assertEquals(600, chk.checkout("AAAAAAABBBCCCEEEEEE"));
        assertEquals(-1, chk.checkout(null));
        assertEquals(275, chk.checkout("SSSTTTXXXYYYZZZA"));*/
        assertEquals(296, chk.checkout("SSSTTTXXXYYYZZZAZ"));

    }


}



