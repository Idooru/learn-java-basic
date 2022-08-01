package test2;

interface A {
    int a = 1;

    public void printA();
}

interface B {
    int b = 2;

    public void printB();
}

interface C {
    int c = 3;

    public void printC();
}

interface D {
    int d = 4;

    public void printD();
}

class Interface implements A, B, C, D {

    public void printA() {
        System.out.println(A.a);
    }

    public void printB() {
        System.out.println(B.b);
    }

    public void printC() {
        System.out.println(C.c);
    }

    public void printD() {
        System.out.println(D.d);
    }

    public void runAll() {
        this.printA();
        this.printB();
        this.printC();
        this.printD();
    }
}

public class InterfaceDemo extends Interface {
    public static void main(String[] args) {
        Interface itf = new Interface();

        itf.runAll();
    }
}