import java.util.Scanner;

class demooo{
    void add(int a,int b){
        System.out.println("input add function:");
        System.out.println(a+b);
    }
    void add(float a,float b){
        System.out.println("input add function:");
        System.out.println(a+b);
    }
}
public class javaDemo {
    public static void main(String[] args) {
        
        demooo d=new demooo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Taking input from the user integer value:");
        int c=sc.nextInt();
        int e=sc.nextInt();
        d.add(c,e);
        System.out.println("Taking input from the user Floting value:");
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        d.add(x,y);
        
    }
    
}
