package Generics_Class_Program;
 class demo1 <T>{
    T i;
    demo1(T x){
        i=x;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
    }
}

public class generics1 {
public static void main(String[] args) {
    demo1<Integer> ob1=new demo1(100);
    demo1<String> ob2=new demo1("hello");
    ob1.show();
    ob2.show();


}
    
}
