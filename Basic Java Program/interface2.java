interface a1{
void add(int x,int y);
}
interface b1 extends a1{
     void sub(int x,int y);
}
class c1 implements a1,b1{
   @Override
    public void add(int x, int y){
    System.out.println(x+y);
         }
@Override
   public  void sub(int x, int y) {
     System.out.println(x-y);
        
    }
 
    
}
public class interface2 {
    public static void main(String[] args) {
     c1 ob=new c1();
     ob.add(400,200);
     ob.sub(100,10);
    }
}
