import java.util.Scanner;

public class clgassignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter array element");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            int temp = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[temp] > arr[j]) {
                    temp = j;
                }
                int temp2 = arr[i];
                arr[i] = arr[temp2];
                arr[temp2] = temp2;

            }
            System.out.println("sorted array is");
            for (int n = 0; n < size; n++)
                System.out.println(arr[i] + "");

        }
    }
}
