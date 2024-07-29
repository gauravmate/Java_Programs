//import java.util.jar.Manifest;

class demo14{
    private int id;
    private String name;
    public demo14(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
  
}
public class needoverloading {
public static void main(String[] args) {

   // demo14 ob=new demo14(1, "aaa");

demo14 st=new demo14(100,"abc");
System.out.println(st.toString());
System.out.println(st.toString());

}    
}
