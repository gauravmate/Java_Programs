package Generics_Class_Program;
class demo2<T, V>{
    T i;
    V j;
    demo2(T x, V y){
        i=x;
        j=y;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
        System.out.println(j);
        System.out.println(j.getClass().getName());
    }
}
public class two_paramether {
    public static void main(String[] args) {
        demo2<Integer,String> ob=new demo2(100,"gaurav");
        ob.show();
        
    }
}
