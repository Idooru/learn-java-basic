package io.demo;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import test.Test;
import test.SamePackage;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Bmw bmw = new Bmw();
		bmw.action();

		Intro intro = new Intro();
		intro.sayName();

		// Test result = new Test();
		// System.out.println(result.a);

		// int result2 = result.sum();
		// System.out.println(result2);

		String someLiteral = "Idooru";
		String someObject = new String("Idooru");
		final String someChar = "a";
		var test = "string";

		System.out.println("개쩐당");

		String strNumber = "1234";

		String[] someArray = { "Hello", "Java", "Programming" };
		List<String> testList = new ArrayList<String>();
		testList.add("1");

		System.out.println();
		System.out.println(Arrays.toString(someArray));
		System.out.println(testList);
		System.out.println();

		System.out.println(test);

		System.out.println(someArray.length);

		for (int i = 0; i < someArray.length; i++) {
			System.out.println(someArray[i]);
		}

		System.out.println(someLiteral);
		System.out.println(someObject);

		System.out.println(someLiteral.equals(someObject));
		System.out.println(someLiteral == someObject);

		int[] grade1 = new int[3];
		System.out.println(Arrays.toString(grade1));

		for (int i = 0; i < grade1.length; i++) {
			grade1[i] = i + 1;
		}

		System.out.println(Arrays.toString(grade1));

		int[][] arr = { { 10, 20 }, { 10, 20, 30, 40 }, { 10 } };
		System.out.println(Arrays.toString(arr));

		Car2 car2 = new Car2("BMW", 2022, "Black");

		System.out.println(car2.getModel());
		car2.accelerate(5, 10);

		Test myTest = new Test();

		myTest.test2();

		SamePackage sp = new SamePackage();
		System.out.println(sp.onPublic);

	}

}
