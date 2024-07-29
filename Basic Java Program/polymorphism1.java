class test12{
void add(int x,int y){
System.out.println("Int add function called");
System.out.println(x+y);
}
void add(float x,float y){
    System.out.println("float add function called");
    System.out.println(x+y);   
}
}
public class polymorphism1 {
 public static void main(String[] args) {
    test12 ob1=new test12();
   ob1.add(100,200);
    ob1.add(2.1f,2.2f);
 }   
}
