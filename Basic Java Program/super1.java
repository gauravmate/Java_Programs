class A5{
    int i;
    A5(){
        i=10;
        System.out.println("constructor without argument");
    }
    A5(int x){
        i=x;
        System.out.println("constructer with argument");
    }
}
class B5 extends A5{
    int i;
    B5(){
        super(100);
        i=20;
        System.out.println("IN B");
    }
    void Add(){
        System.out.println(i+super.i);
    }
}
public class super1 {
 public static void main(String[] args) {
    B5 ob=new B5();
    ob.Add();
 }   
}
