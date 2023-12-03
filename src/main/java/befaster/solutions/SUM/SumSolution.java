package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

@SuppressWarnings("unused")
public class SumSolution {

    public int compute(int x, int y) {
        if (x == 0) {
            return y;
        }
        if (y == 0) {
            return x;
        }

        return x + y;
    }

}

