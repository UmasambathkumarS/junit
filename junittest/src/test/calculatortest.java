package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junittest.calculator;

class calculatortest {

	

	@Test
	void test() {
		calculator calculator = new calculator();
	    int a = 1234;
	    int b = 5678;
	    int actual = calculator.add(a, b);
	    int actual1 = calculator.subtract(a, b); 
	    
	    int expected = 912;
	    int expected1 = 912;
	    
	    assertEquals(expected, actual);
	    assertEquals(expected1, actual1);
	}
	}


