package test2;

import test.SamePackage;

public class PackageTest {
    public int a = 5;
    int b = 6;

    public static void main(String[] args) {
        SamePackage sp = new SamePackage();

        System.out.println(sp.onPublic);
    }
}
