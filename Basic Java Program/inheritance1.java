class Z{
    void show(){
        System.out.println("in A");
    }
}
class Ca extends Z{
    void disp()   {
        System.out.println("IN b");
    }
}




public class inheritance1 {
  public static void main(String[] args) {
   Ca ob=new Ca();
   ob.show();
   ob.disp(); 
  }  
}
