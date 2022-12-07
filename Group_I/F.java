import java.util.*;

class F {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean flag = true;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] != arr[j][i]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
            System.out.println("Matrix is symmetric!");
        else
            System.out.println("Matrix is not symmetric!");
        sc.close();
    }
}
