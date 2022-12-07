import java.util.*;

class D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int num = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > num) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = num;
        }
        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}