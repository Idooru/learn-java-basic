package test2;

interface I2 {
    public String A();
}

interface I3 {
    public String B();
}

class De implements I2, I3 {
    public String A() {
        return "Interface1";
        // System.out.println("Interface1");
    }

    public String B() {
        return "Interface2";
        // System.out.println("Interface2");
    }
}

public class PolymorphismDemo2 {
    public static void main(String[] args) {

        De obj = new De();
        I2 objI2 = new De();
        I3 objI3 = new De();

        obj.A();
        obj.B();

        System.out.println(objI2.A());
        System.out.println(objI3.B());
    }
}
