package test2;

public class Child extends Parents {
    public int c = 3;
    public int d = 5;

    public Child(int a, int b) {
        super(a, b);
    }

    public void printSumResult() {
        System.out.println(super.sum());
    }

    public int sum() {
        return super.sum();
    }

    public int sumThree() {
        return super.a + super.b + this.c;
    }

    public int showVarD() {
        return super.d;
    }
}