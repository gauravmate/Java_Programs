import java.util.Scanner;
public class area {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a,r;
        System.out.println("enter a redius");
        r=sc.nextInt();
        a=3.14f*r*r;
        System.out.println("area is"+a);

    }
}
