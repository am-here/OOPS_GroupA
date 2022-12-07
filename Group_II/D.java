import java.util.*;

class Circle {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    int get_radius() {
        return radius;
    }

    double calc_area() {
        return 22 / 7.0 * radius * radius;
    }
}

class D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        Circle obj = new Circle(radius);
        System.out.println("Radius of Circle: " + obj.get_radius());
        System.out.println("Area of Circle: " + obj.calc_area());
        sc.close();
    }
}