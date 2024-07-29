import java.util.Scanner;

public class clgassignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the array element:");
        for (i = 0; i < size; i++)

            arr[i] = sc.nextInt();

        for (i = 0; i < size; i++) {
            int temp = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[temp] > arr[j]) {
                    temp = j;
                }
                int temp2 = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp2;

            }
        }

        System.out.println("Accending order  is");
        for (i = 0; i < size; i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println();
        System.out.println("Deccending Order");
        for (i = size - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }
}
