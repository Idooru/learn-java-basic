package gerneric;

class StudentInfo {
    public int grade;

    StudentInfo(int grade) {
        this.grade = grade;
    }
}

class EmployeeInfo {
    public int rank;

    EmployeeInfo(int rank) {
        this.rank = rank;
    }
}

class Person<T, U> {
    public T info;
    public U age;

    Person(T info, U age) {
        this.info = info;
        this.age = age;
    }
}

public class GenericDemo {

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo(2);
        EmployeeInfo e1 = new EmployeeInfo(4);

        Person<String, Number> p3 = new Person<String, Number>("김부장", 56);
        System.out.println(p3.info);
        System.out.println(p3.age);
        System.out.println(p3);

        GenericDemo.sayHello();
    }
}
