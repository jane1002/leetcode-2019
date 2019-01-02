package google;

import org.junit.Before;
import org.junit.Test;


public class FlippingAnImage832Test {
    private FlippingAnImage832 test;

    @Before
    public void setup() {
        test = new FlippingAnImage832();
    }

    @Test
    public void getNumberOfUniqueEmailAddress() {
        int[][] images = {{1,1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] res = test.flipAndInvertImage(images);
        System.out.println(res);
    }
}
