package test2;

abstract class Parents {
    public int a, b;
    public int d = 4;

    public Parents(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return this.a + this.b;
    }
}
