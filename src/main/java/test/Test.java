package test;

public class Test {
    String sameVer = "같은 패키지는 허용";

    private void test1() {
        System.out.println("\nModule Test");
    }

    public void test2() {
        this.test1();
    }
}
