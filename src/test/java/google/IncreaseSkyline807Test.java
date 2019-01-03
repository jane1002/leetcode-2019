package google;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncreaseSkyline807Test {
    private IncreaseSkyline807 test;

    @Before
    public void setup() {
        test = new IncreaseSkyline807();
    }

    @Test
    public void getNumberOfUniqueEmailAddress() {
        int[][] grid = {{3,0,8,4}, {2,4,5,7}, {9,2,6,3}, {0,3,1,0}};
        int res = test.maxIncreaseKeepingSkyline(grid);
        assertEquals(35, res);
    }
}
