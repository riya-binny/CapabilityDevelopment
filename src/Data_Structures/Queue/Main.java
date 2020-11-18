package Data_Structures.Queue;

public class Main {
    public static void main(String[] args) {
        // No. of recent calls
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1) + " " +
                recentCounter.ping(100) + " " +
                recentCounter.ping(3001) + " " +
                recentCounter.ping(3002));
        
        // Task Schedule
        TaskScheduler taskScheduler = new TaskScheduler();
        char[] input = {'A','A','A','B','B','B'};
        System.out.println(taskScheduler.leastInterval(input, 2));
    }
}
