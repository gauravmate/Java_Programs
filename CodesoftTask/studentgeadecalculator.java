package CodesoftTask;
import java.util.Scanner;

public class studentgeadecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4, n5, n6, total;
        String subject;
        float per;
        System.out.println("Enter The Number Of Subject");
        subject = sc.next();
        System.out.println("Enter the mark Obtaint Each subject");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();
        n6 = sc.nextInt();

        total = n1 + n2 + n3 + n4 + n5 + n6;
        System.out.println("Total is:" + total);
        per = (total * 100) / 6;
        System.out.println("Percetage is:" + per);

        if (per > 90) {
            System.out.println("Grade A");
        } else if (per > 70) {
            System.out.println("Grade B");
        } else if (per > 50) {
            System.out.println("Grade C");
        } else
            System.out.println("Fail !");

    }

}
