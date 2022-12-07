import java.util.*;

class B2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sp = -1;
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            sp += 2;
            ch = (char) (65 + n - i);
            for (int j = 1; j <= n - i + 1; j++) {
                if (!(i == 1 && j == 1))
                    System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
        sc.close();
    }
}