import java.util.Scanner;

class Employee{
    String name;
    int id,salary;
    String designation;
    Scanner sc=new Scanner (System.in);

void empname(){
    System.out.println("enter employee name");
    name=sc.next();
}
void empid(){
    System.out.println("enter employee id");
    id=sc.nextInt();

}
void empsalary(){
   System.out.println("enter employee salary");
    salary=sc.nextInt();
}

void empdesignation(){
    System.out.println("enter employee designation");
    designation=sc.next();
}
void display(){
    System.out.println("*************");
    System.out.println("neme="+name);
    System.out.println("id="+id);
    System.out.println("salary="+salary);
    System.out.println("designation="+designation);
    System.out.println("*************");
}
}
public class object2 {
   public static void main(String[] args) {

    Employee obj=new Employee();
    obj.empname();
    obj.empid();
    obj.empsalary();
    obj.empdesignation();
    obj.display();
   }
}
