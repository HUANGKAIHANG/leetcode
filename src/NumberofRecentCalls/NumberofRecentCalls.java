package NumberofRecentCalls;

import java.util.LinkedList;
import java.util.Queue;

public class NumberofRecentCalls {
    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        System.out.println(obj.ping(1));
        System.out.println(obj.ping(100));
        System.out.println(obj.ping(3001));
        System.out.println(obj.ping(3002));
    }
}

class RecentCounter {
    private Queue<Integer> queue;
    RecentCounter() {
        queue = new LinkedList<>();
    }

    int ping(int t) {
        queue.add(t);
        while(queue.size()>0){
            if (t-queue.peek()>3000)
                queue.poll();
            else
                break;
        }
        return queue.size();
    }
}
