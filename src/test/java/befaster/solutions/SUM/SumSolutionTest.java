package befaster.solutions.SUM;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @BeforeEach
    public void setUp() {
        sum = new SumSolution();
    }

    @Test
    public void compute_sumBothPositive() {
        assertThat(sum.compute(50, 50), equalTo(100));
    }

    @Test
    public void compute_sumXEquals0() {
        assertThat(sum.compute(0, 100), equalTo(100));
    }

    @Test
    public void compute_sumYEquals0() {
        assertThat(sum.compute(100, 0), equalTo(100));
    }

}

