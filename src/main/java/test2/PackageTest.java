package test2;

import test.SamePackage;

public class PackageTest {
    public static void main(String[] args) {
        SamePackage sp = new SamePackage();

        System.out.println(sp.onPublic);
    }
}
