abstract class a2{
    void show(){
        System.out.println("IN A");
    }
    abstract void add(int x,int y);
    abstract void sub(int x,int y);
}


class b2 extends a2{
@Override
    void add(int x, int y){
    System.out.println(x+y);
         }
@Override
    void sub(int x, int y) {
     System.out.println(x-y);
        
    }

}
public class interface1{
public static void main(String[] args) {
    b2 ob=new b2();
    ob.show();
    ob.add(100,200);
    ob.sub(90,10);

}    
}