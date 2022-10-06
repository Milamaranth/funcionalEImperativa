package com.programacionImperativaYFuncional.ejemplo;

import java.util.List;

public class EjemploImperativo {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(18,6, 4, 15, 55, 78, 12, 9, 8);
		
		long count = 0;
		for (int num : numbers) {
			if (num > 10) {
				count += 1;
			}
		}
	
		System.out.println(count);
	}

}
