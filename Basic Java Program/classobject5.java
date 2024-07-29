import java.util.Scanner;
class demo11j{
    String name;
    int balance;
    Scanner sc=new Scanner(System.in);
    void name(){
        System.out.println("enter full name of the customer");
        name=sc.next();

    }
    void balance(){
        System.out.println("enter customer balance");
        balance=sc.nextInt();
    }
    void show(){
        System.out.println(name);
        System.out.println(balance);
    }
}
public class classobject5 {
 public static void main(String[] args) {
 demo11j ob1=new demo11j();
 demo11j ob2=new demo11j();
 ob1.name();
 ob1.balance();
 ob2.name();
 ob2.balance();
 ob1.show();
 ob2.show();

 }   
}
