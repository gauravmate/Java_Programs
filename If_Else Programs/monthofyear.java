import java.util.Scanner;
public class monthofyear{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in) ;
    int month;
    System.out.println("enter the month (1-12)");
    month=sc.nextInt();
      if(month==1) {
        System.out.println("jan");
    }else if(month==2){
        System.out.println("feb");
    }else if(month==3){
        System.out.println("mar");
    }else if(month==4){
        System.out.println("april");
    }    else if(month==5){
            System.out.println("may");
    }else if(month==6){
        System.out.println("jun");
    }else if(month==7){
        System.out.println("juliy");
    }else if(month==8){
        System.out.println("aug");
    }else if(month==9){
        System.out.println("sab");
    }else if(month==10){
        System.out.println("abto");
    }    else if(month==11){
            System.out.println("nov");
    }else if(month==12){
        System.out.println("dis");
    } else{
        System.out.println("pleace enter the month(1-12)");
    }
}
}