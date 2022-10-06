package com.programacionImperativaYFuncional.ejemplo;

import java.util.List;
import java.util.function.*;

public class EjemploFuncional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(18,6, 4, 15, 55, 78, 12, 9, 8);
		
		long count = numbers.stream().filter(num -> num > 10).count();

		System.out.println(count);
	}
}
