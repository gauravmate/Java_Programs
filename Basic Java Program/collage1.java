import java.util.Scanner;

public class collage1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, no;
        no = 5;
        for (i = 1; i <= no; i++) {
            for (j = no; j > i; j--) {
                System.out.println(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.println("" + k);
            }
            for (k = i - 1; k >= 1; k--) {
                System.out.println("" + k);
            }
            System.out.println();
        }

    }

}
