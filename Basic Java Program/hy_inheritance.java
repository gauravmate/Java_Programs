class person1{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
class student1{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

}
class teacher extends person1{
    private float salary;
    private String sub;
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getSub() {
        return sub;
    }
    public void setSub(String sub) {
        this.sub = sub;
    }
    
}
class clgstudent extends student1{
    private int year;
    private String branch;
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    

}
public class hy_inheritance {
 public static void main(String[] args) {
    teacher ob1=new teacher();
    ob1.setName("gaurav");
    ob1.setSalary(20000);
    ob1.setSub("java");

    System.out.println(ob1.getName());
    System.out.println(ob1.getSalary());
    System.out.println(ob1.getSub());

    clgstudent ob2=new clgstudent();
    ob2.setId(87);
    ob2.setYear(19);
    ob2.setBranch("Deogiri");

    System.out.println(ob2.getId());
    System.out.println(ob2.getYear());
    System.out.println(ob2.getBranch());

 }   
}
