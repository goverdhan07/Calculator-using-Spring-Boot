package com.calculator.operation.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorApplicationTests{
	operation o = null;

	@BeforeEach
	public void setUp()
	{
		o = new operation();
	}

	@Test
	public void testAdd(){
		assertEquals(70,res.sub(50,20));
	}
}