package test2;

interface ExceptionInterface {
    public boolean index();
}

class ExceptionOne implements ExceptionInterface {
    private int divisibleNumber, divisor;

    ExceptionOne(int divisibleNumber, int divisor) {
        this.divisibleNumber = divisibleNumber;
        this.divisor = divisor;
    }

    public boolean index() {
        int result;

        try {
            result = this.divisibleNumber / this.divisor;
        } catch (Exception err) {
            err.printStackTrace();
            return false;
        }

        System.out.println("result : " + result);
        return true;
    }
}

class ExceptionTwo implements ExceptionInterface {
    private int arr[] = new int[3];
    int first, second;

    ExceptionTwo(int first, int second) {
        this.first = first;
        this.second = second;
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }

    public boolean index() {
        int result;

        try {
            result = arr[first] / arr[second];
        } catch (ArithmeticException err) {
            System.out.println("ArithmeticException");
            err.printStackTrace();
            return false;
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("ArrayIndexOutOfBoundsException");
            err.printStackTrace();
            return false;
        } catch (Exception err) {
            System.out.println("Exception");
            err.printStackTrace();
            return false;
        } finally {
            System.out.println("finally");
        }

        System.out.println("result : " + result);
        return true;
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        ExceptionInterface resultOne = new ExceptionOne(10, 2);
        ExceptionInterface resultTwo = new ExceptionTwo(2, 1);

        System.out.println(resultOne.index());
        System.out.println(resultTwo.index());
    }
}
