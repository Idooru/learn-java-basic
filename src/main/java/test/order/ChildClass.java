package test.order;

import test.SameClass;

public class ChildClass extends SameClass {
    public String warning = "경고";

    public static void main(String[] args) {
        SameClass sc = new SameClass();

        sc.printSameVar();
        // System.out.println(sc.sameVar);
    }
}
