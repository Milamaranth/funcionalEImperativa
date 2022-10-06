package com.programacionImperativaYFuncional.ejemplo;

import java.util.List;

public class EjemploFuncional {

	public static void main2(String[] args) {
		List<Integer> numbers = List.of(18,6, 4, 15, 55, 78, 12, 9, 8);
		
		long count = numbers.stream().filter(num -> num > 10).count();

		System.out.println(count);
	}
}
