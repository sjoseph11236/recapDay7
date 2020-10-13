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
		double expected = 2 * Math.PI * radius; 
//		actual 
		double actual = calc.circumference(radius);
//		verify
		assertEquals(actual, expected, "Doesnt give the right circumference");
	}

}
