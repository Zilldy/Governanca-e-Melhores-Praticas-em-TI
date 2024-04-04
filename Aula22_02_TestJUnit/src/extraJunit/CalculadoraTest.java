package extraJunit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void calcSomar() {
		Calculadora calc = new Calculadora();
		double re = calc.somar(1, 2);
		
		assertEquals(re, 3, 0);
	}

	@Test
	public void calcSubtrair() {
		Calculadora calc = new Calculadora();
		double re = calc.subtrair(4, 1);
		
		assertEquals(re, 3, 0);
	}
}