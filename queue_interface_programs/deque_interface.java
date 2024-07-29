package queue_interface_programs;
import java.util.ArrayDeque;
import java.util.Deque;
public class deque_interface {
    public static void main(String[] args) {
        Deque<Integer> gm = new ArrayDeque<>();
        gm.addLast(10);
        gm.addLast(20);
        gm.addFirst(30);
        gm.addFirst(40);
        gm.addFirst(50);
        gm.addFirst(60);
        gm.addFirst(70);
        gm.addFirst(80);
        System.out.println(gm);
        System.out.println(gm.getFirst());
        System.out.println(gm.getLast());
        System.out.println(gm.pollLast());
        System.out.println(gm.pollFirst());

    }
}
