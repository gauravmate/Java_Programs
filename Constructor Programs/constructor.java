class demo1{
    int i;
    int j;

    demo1(){
        i=20; 
        j=30;
        System.out.println("constructor without arg called");
    }
    void add(){
        System.out.println(i+j);
    }
}
public class constructor {
    public static void main(String[] args) {
      demo1 ob1=new demo1();
      demo1 ob2=new demo1();
      ob1.add();
      ob1.add();   
    }
    
}
