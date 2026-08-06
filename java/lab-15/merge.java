import java.util.*;

class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];
        int i, j = 0;

        System.out.println("Enter 5 elements of first array:");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter 5 elements of second array:");
        for (i = 0; i < 5; i++) {
            b[i] = sc.nextInt();
        }

        for (i = 0; i < 5; i++) {
            c[j] = a[i];
            j++;
        }

        for (i = 0; i < 5; i++) {
            c[j] = b[i];
            j++;
        }

        System.out.println("Merged Array:");

        for (i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
