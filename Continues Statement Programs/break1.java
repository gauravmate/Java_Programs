import java.util.Scanner;
public class break1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
