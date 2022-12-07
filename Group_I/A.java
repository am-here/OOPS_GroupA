import java.util.*;

class A {
    static void non_fib(int a, int b, int n) {
        for (int i = a + 1; i < b; i++) {
            if (n <= 0)
                return;
            System.out.print(i + " ");
            n--;
        }
        non_fib(b, a + b, n);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        non_fib(0, 1, n);
        sc.close();
    }
}