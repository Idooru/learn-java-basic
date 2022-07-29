package test2;

import test2.GiveForMain;

public class InheritanceTest extends GiveForMain {
    public static void main(String[] args) {
        int result = receive();
        System.out.println(result);
    }

    public static int receive() {
        System.out.println("GiveForMain안에 있는 필드 = " + GiveForMain.a);
        return GiveForMain.a;
    }

}