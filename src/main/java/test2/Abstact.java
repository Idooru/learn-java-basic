package test2;

abstract class Test {
    public abstract void testing();
}

class Tast extends Test {
    public void testing() {
        System.out.println("Hello");
    }
}

public class Abstact {
    public static void main(String[] args) {
        Tast tast = new Tast();
    }
}
