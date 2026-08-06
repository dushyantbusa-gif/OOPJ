import java.util.*;

class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[4][4];
        int i, j, sum;

        System.out.println("Enter 16 numbers:");

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nRow Sum:");
        for (i = 0; i < 4; i++) {
            sum = 0;
            for (j = 0; j < 4; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " = " + sum);
        }

        System.out.println("\nColumn Sum:");
        for (j = 0; j < 4; j++) {
            sum = 0;
            for (i = 0; i < 4; i++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Column " + (j + 1) + " = " + sum);
        }
    }
}
