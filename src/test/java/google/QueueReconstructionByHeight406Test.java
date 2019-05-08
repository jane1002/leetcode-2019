package google;

import org.junit.Before;
import org.junit.Test;

public class QueueReconstructionByHeight406Test {
    private QueueReconstructionByHeight406 test;

    @Before
    public void setup() {
        test = new QueueReconstructionByHeight406();
    }

    @Test
    public void reconstruct() {
        int data[][] = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};

        System.out.println(test.reconstructQueue(data).length);
        test.reconstructQueue(data);
    }
}
