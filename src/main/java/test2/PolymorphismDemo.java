package test2;

class Human {
    public void call() {
        System.out.println("Human call");
    }

    static void staticy() {
        System.out.println("Human static");
    }
}

class Chulsu extends Human {
    public void call() {
        System.out.println("Chulsu call");
    }

    public void status() {
        System.out.println("Chulsu status");
    }
}

interface Champion {
    public void call();
}

class Garen implements Champion {
    public void call() {
        System.out.println("Garen call");
    }

    static void staticy() {
        System.out.println("Garen static");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {
        Human chulsu = new Chulsu();

        chulsu.call();
        chulsu.staticy();
        Chulsu.staticy();
        // chulsu.status(); // Human 객체에 status() 메서드가 없기 때문에 사용 불가능

    }
}