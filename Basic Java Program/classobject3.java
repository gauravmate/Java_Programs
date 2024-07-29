import java.util.Scanner;
class demoi9{
    int classyear;
    String Fristname,lastname;
    Scanner sc=new Scanner(System.in); 

    void year(){
        System.out.println("enter class year");
        classyear=sc.nextInt();

    }
    void Frist(){
        System.out.println("enter frist name"); 
        Fristname=sc.next();
    }
    void last(){
        System.out.println("enter last name");  
        lastname=sc.next();  
    }
    void show(){
        System.out.println(classyear); 
        System.out.println(Fristname);  
        System.out.println(lastname);
    }
}
public class classobject3 {
 public static void main(String[] args) {
    
    demoi9 ob1=new demoi9();
    ob1.year();
    ob1.Frist();
    ob1.last();  
    ob1.show();

 }   
}
