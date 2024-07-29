import java.util.LinkedList;

public class linkedlist1 {
   public static void main(String[] args) {
    
    LinkedList<Integer> ob=new LinkedList<>();

    //insertion at end
    ob.addLast(10);
    ob.addLast(20);
    ob.addLast(30);
    ob.addLast(40);

    //insertion in begining
    ob.addFirst(80);
    ob.addFirst(90);
    System.out.println(ob);

    //deletion at end
    ob.removeLast();
    System.out.println(ob);

    //deletion at start
    ob.removeFirst();
    System.out.println(ob);
   } 
}
