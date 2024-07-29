class student{
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    

}
public class incapsulation {
    public static void main(String[] args) {
        student ob1=new student();
         ob1.setId(100);
         ob1.setName("abc");
         int x=ob1.getId();
         String n=ob1.getName();
         System.out.println("id"+x);
         System.out.println("name"+n);
    }
    
}
