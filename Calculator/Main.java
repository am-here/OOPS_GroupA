package Calculator;

import java.util.*;
import Calc_Package.Calculator;

class Calc implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter a: ");
        int b = sc.nextInt();
        Calculator obj = new Calc();
        System.out.println("Addition: " + obj.add(a, b));
        System.out.println("Substraction: " + obj.sub(a, b));
        System.out.println("Multiplication: " + obj.mult(a, b));
        System.out.println("Division: " + obj.div(a, b));
        sc.close();
    }
}
