package test2;

abstract class Test {
    public abstract void testing();
}

class Tast extends ABC {
    public void testing() {
        System.out.println("Hello");
    }
}

public class Abstact {
    public static void main(String[] args) {
        Tast tast = new Tast();

        tast.testing();
        System.out.println(tast);
    }
}