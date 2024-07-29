class demo4{
    int i=100;
    void show(){
        int i=200;
        System.out.println(i);
    }
}
public class local {
    public static void main(String[] args) {
    demo4 ob1=new demo4();
    ob1.show();    
    }
    
}
