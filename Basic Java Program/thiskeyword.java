class demo6{
    int i;
    demo6(int i){
        this.i=i;
    }
    void show(){
        System.out.println(i);
    }
}
public class thiskeyword {
 public static void main(String[] args) {
  demo6 ob1=new demo6(10);
  ob1.show();
 }   
}
