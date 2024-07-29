class demo7{
     int i;
    static int j;
    demo7(){
        i++;
        j++;
    }
    void show(){
System.out.println(i);    
System.out.println(j);  }

}
public class staticvariable {
 public static void main(String[] args) {
  demo7 ob1=new demo7();
  demo7 ob2=new demo7();
  demo7 ob3=new demo7();
  ob1.show();
  ob2.show();
  ob3.show();  
 }   
}
