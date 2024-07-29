import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in) ;
     int cp,sp,p,l;
     System.out.println("Enter cost price");
     cp=sc.nextInt();
     System.out.println("enter selling price");
     sp=sc.nextInt();
     if(cp>sp){
        p=cp-sp;
        System.out.println("prifit"+p);
     }else if(cp<sp){
        l=sp-cp;
        System.out.println("loss"+l);
     }else{
        System.out.println("no profit no loss");
     }

    }
    
}
