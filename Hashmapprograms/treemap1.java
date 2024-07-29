import java.util.Collection;
import java.util.TreeMap;

public class treemap1 {
    public static void main(String[] args) {
        TreeMap <Integer, String> ob=new TreeMap<>();
        ob.put(4, "gaurav");
        ob.put(1, "vaibhav");
        ob.put(2, "ganesh");
        ob.put(3, "vaibhav1");
        System.out.println(ob);

       System.out.println("All Value");
       Collection <String> mvalues=ob.values();
       for (String s : mvalues) {
        System.out.println(s);
       }

       
    }
}
