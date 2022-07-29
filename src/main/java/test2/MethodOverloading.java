package test2;

class Test {
    void display(int num1) {
        System.out.println(num1);
    }

    void display(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    void display(int num1, double num2) {
        System.out.println(num1 + num2);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Test myFunc = new Test();

        myFunc.display(10);
        myFunc.display(10, 20);
        myFunc.display(10, 3.14);
        myFunc.display(10, 'a');
    }
}
