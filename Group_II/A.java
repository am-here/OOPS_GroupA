import java.util.*;

class Student {
    int roll;
    String name;
    int marks[] = new int[3];

    void assign(int roll, String name, int marks[]) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    void compute() {
        int total = marks[0] + marks[1] + marks[2];
        System.out.println("Total marks: " + total + "\nAverage Marks: " + total / 3);
    }

    void display() {
        System.out.println("Roll: " + roll +
                "\nName: " + name + " " +
                "\n-- Marks -- " + "\nSubject 1: " + marks[0] + "\nSubject 2: " + marks[1] + "\nSubject 3: "
                + marks[2]);
        compute();
    }
}

public class A {

    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        int n = sc1.nextInt();
        Student Stu[] = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll: ");
            int roll = sc1.nextInt();
            System.out.print("Enter name: ");
            String name = sc2.nextLine();
            int marks[] = new int[3];
            System.out.print("Enter marks: ");
            marks[0] = sc1.nextInt();
            marks[1] = sc1.nextInt();
            marks[2] = sc1.nextInt();
            Stu[i] = new Student();
            Stu[i].assign(roll, name, marks);
        }
        boolean flag = true;
        do {
            System.out.print("Enter roll to search: ");
            int roll = sc1.nextInt();
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (Stu[i].roll == roll) {
                    Stu[i].display();
                    found = true;
                }
            }
            if (!found)
                System.out.println("Roll not found!");
            System.out.print("Do you want to continue?(true/false) ");
            flag = sc2.nextBoolean();
        } while (flag);
        sc1.close();
        sc2.close();
    }
}