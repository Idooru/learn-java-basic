package test2;

import java.util.*;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public List<Integer> main() {
        List<Integer> resultList = new ArrayList<Integer>();

        resultList.add(this.returnSum());
        resultList.add(this.returnMin());
        resultList.add(this.returnMul());
        resultList.add(this.returnDiv());

        return resultList;

    }

    public int returnSum() {
        return this.a + this.b;
    }

    public int returnMin() {
        return this.a - this.b;
    }

    public int returnMul() {
        return this.a * this.b;
    }

    public int returnDiv() {
        return this.a / this.b;
    }
}
