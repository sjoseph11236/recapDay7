package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.MathUtil;


class ReacpTests {
	
	MathUtil calc; 

	@BeforeEach
	void setUp() {
		calc = new MathUtil();
	}
	
	@Test
	void testCircumference() {
		int radius = 4; 
//		expected
		double expect = 2 * Math.PI * radius; 
//		actual 
		double actual = calc.circumference(radius);
//		verify
		assertEquals(actual, expect, "Doesnt give the right circumference");
	}
	
	@Test
	void testAdd() {
		int expect = 2; 
		int actual = calc.add(1,1);
		assertEquals(actual, expect);	
	}
}
