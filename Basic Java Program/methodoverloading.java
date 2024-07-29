class a12{
    void show(){
        System.out.println("in a");
    }
}
    class b12 extends a12{
        void show(){
            System.out.println("in b");   
    }
}
public class methodoverloading {
public static void main(String[] args) {
 b12 ob=new b12();
 ob.show();
 ob.show();   
}    
}
