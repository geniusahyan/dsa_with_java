package OOP;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.rno = 34;
        s1.name = "<NAME>";
        s1.age = 23;
        System.out.println(s1.age);
    }
    
}
class Student {
    int rno;
    String name;
    int age = 12;

    Student(){
        System.out.println(this);
    }
}
