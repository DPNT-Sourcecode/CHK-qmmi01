package befaster.solutions.HLO;

import befaster.solutions.SUM.SumSolution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloSolutionTest {
    private HelloSolution hlo;

    @BeforeEach
    public void setUp() {
        hlo = new HelloSolution();
    }

    @Test
    public void helloWorldNullFriendNameTest(){
        assertEquals("Hello World!", hlo.hello(null));
    }
}

