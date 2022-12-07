import java.util.*;

interface stack {
    void push(int val);

    int pop();
}

class dyn_stack implements stack {
    int stk[];
    int tos;

    dyn_stack(int n) {
        stk = new int[n];
        tos = -1;
    }

    public void push(int val) {
        if (tos == stk.length - 1) {
            int temp[] = new int[stk.length * 2];
            for (int i = 0; i <= tos; i++) {
                temp[i] = stk[i];
            }
            stk = temp;
            stk[++tos] = val;
        } else
            stk[++tos] = val;
    }

    public int pop() {
        if (tos == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stk[tos--];
    }

    void display() {
        for (int i = tos; i >= 0; i--) {
            System.out.print(stk[i] + " ");
        }
    }
}

class F {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial size of Stack: ");
        int n = sc.nextInt();
        dyn_stack S = new dyn_stack(n);
        int flag;
        do {
            System.out.print("Enter 1 to Push and 0 to Pop: ");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter element: ");
                int val = sc.nextInt();
                S.push(val);
            } else {
                S.pop();
            }
            System.out.print("Do you want to continue?(0 to exit) ");
            flag = sc.nextInt();
        } while (flag != 0);
        System.out.print("Stack: ");
        S.display();
        sc.close();
    }
}
