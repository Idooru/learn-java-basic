package test;

public class SameClass {
    String var = "다른 패키지 접근 불가";

    protected String sameVar = "다른 패키지에 속하는 자식 클래스까지 허용";

    public static void main(String[] args) {
        SamePackage sp = new SamePackage();
        System.out.println(sp.samVer);
    }

    public void printSameVar() {
        System.out.println(this.sameVar);
    }
}
