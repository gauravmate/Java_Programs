package Generics_Class_Program;
class demo3<T, V, P>{
    T i;
    V j;
    P k;
    demo3(T x, V y, P n ){
        i=x; j=y;
        k=n;
    } void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
        System.out.println(j);
        System.out.println(j.getClass().getName());
        System.out.println(k);
        System.out.println(k.getClass().getName()); }
    } public class multiple_parameter {
    public static void main(String[] args) {
        demo3<Integer,String,Float> ob=new demo3(100,"gaurav",1.2);
        ob.show();
        
    }
}
