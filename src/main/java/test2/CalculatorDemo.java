package test2;

abstract class Calculator {
    int left, right;

    Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    int _sum() {
        return this.left + this.right;
    }

    int _avg() {
        return (this.left + this.right) / 2;
    }

    public abstract void sum();

    public abstract void avg();

    public void run() {
        sum();
        avg();
    }
}

class CalculatorDecoPlus extends Calculator {
    CalculatorDecoPlus(int left, int right) {
        super(left, right);
    }

    public void sum() {
        System.out.println("+ sum : " + " " + super._sum());
    }

    public void avg() {
        System.out.println("+ avg : " + " " + super._avg());
    }
}

class CalculatorDecoMinus extends Calculator {
    CalculatorDecoMinus(int left, int right) {
        super(left, right);
    }

    public void sum() {
        System.out.println("- sum : " + " " + super._sum());
    }

    public void avg() {
        System.out.println("- avg : " + " " + super._avg());
    }
}

public class CalculatorDemo {
    public static void execute(Calculator cal) {
        System.out.println("실행 결과");

        cal.run();
    }

    public static void main(String[] args) {
        Calculator c1 = new CalculatorDecoPlus(32, 12);
        Calculator c2 = new CalculatorDecoMinus(45, 32);

        execute(c1);
        execute(c2);
    }
}
