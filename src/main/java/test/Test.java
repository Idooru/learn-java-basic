package test;

import test2.*;
import test.order.ChildClass;

public class Test {
    String sameVer = "같은 패키지는 허용";
    static int numb = 25;

    private void test1() {
        System.out.println("\nModule Test");
    }

    public void test2() {
        System.out.println(sameVer);
        System.out.println(numb);
        this.test1();
    }

    public static void main(String[] args) {
        PackageTest a = new test2.PackageTest();
        System.out.println(a.a);

        Test test = new Test();
        test.test2();

        ChildClass cc = new ChildClass();

    }
}
