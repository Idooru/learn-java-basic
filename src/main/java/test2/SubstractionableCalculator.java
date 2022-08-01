package test2;

abstract class Calculator1 {
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class SubstractionableCalculator extends Calculator1 {
    public void subStract() {
        System.out.println(this.left - this.right);
    }
}
