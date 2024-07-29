package queue_interface_programs;

import java.util.ArrayDeque;
import java.util.Queue;

public class queue1 {
   public static void main(String[] args) {
    
    Queue <Integer> ob=new ArrayDeque<>();
    //add
    ob.offer(10);
    ob.offer(20);
    ob.offer(30);
    ob.offer(40);
    ob.offer(50);

    //peek
    System.out.println(ob.peek());
    System.out.println(ob.isEmpty());
    while(!ob.isEmpty()){
        System.out.println(ob.remove());
    }
    System.out.println(ob.isEmpty());
   } 
}
