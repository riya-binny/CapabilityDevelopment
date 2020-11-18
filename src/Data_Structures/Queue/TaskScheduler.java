package Data_Structures.Queue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {

        if(n==0) return tasks.length;

        Map<Character, Integer> taskCount = new HashMap<>();
        for(Character task : tasks)
            taskCount.put(task, taskCount.getOrDefault(task,0)+1);

        PriorityQueue<Integer> pq = new PriorityQueue<>((p1, p2) -> p2-p1);
        taskCount.forEach((key, value) -> pq.offer(value));

        int[] working = new int[tasks.length];
        int c = 0;
        int count = 0;

        while(!pq.isEmpty()) {
            count = 0;
            for(int i = 0; i<=n; i++) {
                if(!pq.isEmpty()){
                    working[count] = pq.poll();
                    count++;
                }
                c++;
            }

            for(int i = 0; i<count; i++){
                if(working[i] - 1 > 0){
                    pq.offer(working[i] - 1);
                }
            }
        }

        return c - (n+1) + count;
    }
}
