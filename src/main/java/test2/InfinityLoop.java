package test2;

import java.util.*;

public class InfinityLoop {
    static int i;

    static void a() {
        i = 0;
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        numbers.forEach((num) -> {
            System.out.println(num);
        });
    }
}
