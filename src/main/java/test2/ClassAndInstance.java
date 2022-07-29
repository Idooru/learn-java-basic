package test2;

class ClassAndInstanceWareHouse {
    static int classNumber = 5;
    int instanceNumber = 11;

    static void printClassNumber() {
        System.out.printf("%d와 함께 클레스 메서드 호출!\n", classNumber);
    }

    void printInstanceNumber() {
        System.out.printf("%d와 함께 인스턴스 메서드 호출!\n", instanceNumber);
    }
}

public class ClassAndInstance {
    public static void main(String[] args) {
        // 클레스를 인스턴스로 만들지 않으면 클레스 메서드 만 사용할 수 있다.
        ClassAndInstanceWareHouse.printClassNumber();

        ClassAndInstanceWareHouse instance = new ClassAndInstanceWareHouse();

        // 인스턴스로 만들면 클레스 메서드와 인스턴스 메서드 모두 사용 가능하다.
        instance.printInstanceNumber();
        instance.printClassNumber();
    }
}