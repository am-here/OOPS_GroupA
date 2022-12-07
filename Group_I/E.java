import java.util.*;

public class E {
    static void rect(int n, char c) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    static void rect(int m, int n, char c) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int m, n;
        char c;
        System.out.println("For Square: ");
        System.out.print("Enter n: ");
        n = sc1.nextInt();
        System.out.print("Enter char: ");
        c = sc2.nextLine().charAt(0);
        rect(n, c);
        System.out.println("For RECTANGLE: ");
        System.out.print("Enter m: ");
        m = sc1.nextInt();
        System.out.print("Enter n: ");
        n = sc1.nextInt();
        System.out.print("Enter char: ");
        c = sc2.nextLine().charAt(0);
        rect(m, n, c);
        sc1.close();
        sc2.close();
    }
}
