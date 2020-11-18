package Data_Structures.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> q = new PriorityQueue<>();
    public RecentCounter() {

    }

    public int ping(int t) {
        int count = 0;
        q.add(t);
        while(q.peek() < t-3000)
            q.remove();
        return q.size();
    }
}
