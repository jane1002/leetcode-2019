package google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueReconstructionByHeight406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        List<int[]> res = new ArrayList<>();

        for(int i = 0; i < people.length; i++) {
            res.add(people[i][1], people[i]);
        }

        return res.toArray(new int[0][0]);

    }
}
