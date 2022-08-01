package test;

import java.util.*;
import test2.*;
import test.order.ChildClass;

import test2.Child;

public class Test {
    String sameVer = "같은 패키지는 허용";
    static int numb = 25;
    static int numc = 26;

    private void test1() {
        System.out.println("\nModule Test");
    }

    public void test2() {
        System.out.println(sameVer);
        System.out.println(numb);
        this.test1();
    }

    public static void main(String[] args) {
        // PackageTest a = new test2.PackageTest();
        // System.out.println(a.a);

        // Test test = new Test();
        // test.test2();

        // // ChildClass cc = new ChildClass();

        // Calculator cst = new test2.Calculator(3, 6);
        // List<Integer> array = cst.main();

        // System.out.println(array);

        // Instance ins = new Instance();

        // ins.findInstance();

        // SubstractionableCalculator c1 = new SubstractionableCalculator();
        // c1.setOperands(10, 5);
        // c1.sum();
        // c1.avg();
        // c1.subStract();

        Child chd = new Child(3, 4);
        chd.printSumResult();
        int result = chd.sum();

        System.out.println(result + 8);
        System.out.println(chd.showVarD());
    }
}
