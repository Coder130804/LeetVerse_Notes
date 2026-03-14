import java.util.*;
import java.util.LinkedList;
public class Q1
{
    public static void main(String[] args) 
    {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);

        System.out.println("using peek(): " + q.peek());
        System.out.println("using element(): " + q.element());

        System.out.println("using remove(): " + q.remove());
        System.out.println("Queue: " + q);

        System.out.println("using poll(): " + q.poll());
        System.out.println("Queue: " + q);

        System.out.println("Output:");
        for(Integer x : q) 
        {
            System.out.println(x);
        }
        System.out.println("Queue size: " + q.size());
        System.out.println("Is queue empty? " + q.isEmpty());
        q.clear();
        System.out.println("Queue after clear(): " + q);
    }
}