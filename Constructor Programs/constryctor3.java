class demo3{
    int i;
    int j;

    demo3(int x,int y){
        i=x; 
        j=y;
        System.out.println("constructor with arg called");
    }
    demo3(){
      i=20;
      j=30; 
      System.out.println("constructor without arg called");
       
    }
    void add(){
        System.out.println(i+j);
    }   
}



public class constryctor3 {
    public static void main(String[] args) {
      demo3 ob1=new demo3 ();
    demo3 ob2=new demo3();
    ob1.add();
    ob2.add();
    }
    
}
