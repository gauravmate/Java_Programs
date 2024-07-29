import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        
        ArrayList<String> ar = new ArrayList<>();
        //add
        System.out.println(ar.size());
        ar.add("A");
        ar.add("B");
        ar.add("C");
        ar.add("D");
        System.out.println(ar.size());
        System.out.println("************************************");

        ArrayList<String> ar1 = new ArrayList<>();
       // addAll
        ar1.add("E");
        ar1.add("F");
        ar1.addAll(ar1);
        System.out.println(ar);
        System.out.println(ar1);
        System.out.println("************************************");

        //contains
        System.out.println(ar.contains("B"));
        System.out.println(ar.contains("S"));
        System.out.println("************************************");

        //removeAll
        ar.removeAll(ar1);
        System.out.println(ar);
        System.out.println("************************************");

        //remove
        System.out.println(ar);
        ar.remove("B");
        System.out.println(ar);
        System.out.println("************************************");

        //convert collection object into array
        System.out.println("By Using Array___");
        Object[] arr = ar.toArray();
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
        System.out.println("************************************");

        //clear & isEmpty
        System.out.println(ar.isEmpty());
        ar.clear();
        System.out.println(ar.isEmpty());
         System.out.println("************************************");



    }
}
