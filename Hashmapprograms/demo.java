import java.util.ArrayList;

public class demo {
 public static void main(String[] args) {
    
    ArrayList <students> ob=new ArrayList<>();
    students st1=new students(100 , "Gaurav");
    students st2=new students(200 , "vaibhav");
    students st3=new students(300 , "Ganesh");
    students st4=new students(400 , "Shubham");
    ob.add(0, st1);
    ob.add(0, st2);
    ob.add(0, st3);
    ob.add(0, st4);

    //show all student
    for (students st : ob) {
        System.out.println(st.getId()+ "" +st.getName());
        
    }
    //search
    int id =800;
    boolean f=false;
    for (students st : ob) {
        if(st.getId()==id){
            f=true;
            break;
        }
        
    }
    if(f==true){
        System.out.println("Found Object");
    }else{
        System.out.println("Object not found");
    }
    //delete
    id=800;
    for (students st : ob) {
        if(st.getId()==id){
            ob.remove(st);
            break;
        }
        
    }
    System.out.println("After deletion");
    for (students st : ob) {
        System.out.println(st.getId()+ "" +st.getName());
        
    }
   
 }   
}
 
