class A41{
    int i;
    A41(){
        i=10;
        System.out.println("IN A");
    }
    void show(){
        System.out.println("IN show A");
    }
}
class B41 extends A41{
    int i;
    B41(){
        i=20;
        System.out.println("IN B");
    }
    void show(){
        System.out.println("IN show B");
    }
    void Add(){
        System.out.println(i+ super.i);
        show();
        super.show();
    }
}

public class supper{
    public static void main(String[] args) {
        B41 ob=new B41();
        ob.Add();
    }
    
}
