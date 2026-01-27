import java.util.*;
public class QueueExample {
    public static void main(String args[]){
        Queue<String> q=new PriorityQueue<>();
        q.add("One");
        q.add("Two");
        q.add("Three");
        System.out.println(q);
         //Access 1st element in queue wo removal
        q.peek();
        System.out.println(q);
        
        //Removes 1st element in queue
        q.poll();
        System.out.println(q);
       
    }
}
