class demoi{
    int i;
    int j;

    demoi(int x,int y){
        i=x; 
        j=y;
        System.out.println("constructor with arg called");
    }
    void add(){
        System.out.println(i+j);
    }   
}
public class constructor1 {
 public static void main(String[] args) {
  demoi ob1=new demoi(10,20);  
  demoi ob2=new demoi(30,40); 
  ob1.add();
  ob2.add();
 }   
}
