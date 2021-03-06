package google;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls933 {
    Queue<Integer> q;

    public NumberOfRecentCalls933() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.add(t);
        while(q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
}
