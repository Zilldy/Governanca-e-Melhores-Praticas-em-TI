package extraJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElevadorTest {

	
	public void entrarNoElevadorTest() {
		Elevador e = new Elevador();
		
		double re = e.entrarNoElevador(73);
		
		assertEquals(73, re, 0);
	}
	
	@Test
	public void sairDoElevadorTest() {
		Elevador e = new Elevador();
		e.setCargaAtual(173);
		double re = e.sairDoElevador(73);
		
		assertEquals(100, re, 0);
	}
	
	@Test
	public void avaliarpeso() {
		Elevador e = new Elevador();
		e.avaliarpeso(130);
		
		
	}
}
