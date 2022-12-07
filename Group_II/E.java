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

class Cylinder extends Circle {
    int radius, height;

    Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    double calc_area() {
        return 2 * 22 / 7.0 * radius * height;
    }
}

class E {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CIRCLE");
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        Circle c = new Circle(radius);
        System.out.println("Radius of Circle: " + c.get_radius());
        System.out.println("Area of Circle: " + c.calc_area());
        System.out.println("CYLINDER");
        System.out.print("Enter radius: ");
        radius = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        Cylinder cy = new Cylinder(radius, height);
        System.out.println("Radius of Circle: " + cy.get_radius());
        System.out.println("Area of Circle: " + cy.calc_area());
        sc.close();
    }
}