class A4{
    int i;
    A4(){
        i=10;
        System.out.println("IN A");
    }
    void show(){
        System.out.println("IN show A");
    }
}
class B4 extends A4{
    int i;
    B4(){
        i=20;
        System.out.println("IN B");
    }
    void show(){
        System.out.println("IN show B");
    }
    void Add(){
        System.out.println(i+super.i);
        show();
       super.show();
    }
}

public class super2 {
    public static void main(String[] args) {
        B4 ob=new B4();
        ob.Add();
    }
    
}
