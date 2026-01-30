class Student {
    int rollno;
    String name;
    int age;
    Student() {
        rollno = 1;
        name = "Tavjeet Singh";
        age = 20;
    }
    Student(int a, String b, int c) {
        rollno = a;
        name = b;
        age = c;
    }
    void display() {
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student(2, "Tavjeet", 20);
        s2.display();
    }
}
