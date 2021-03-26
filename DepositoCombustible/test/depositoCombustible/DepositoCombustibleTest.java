package depositoCombustible;

import static org.junit.Assert.*;


import org.junit.Test;

public class DepositoCombustibleTest {

	private static DepositoCombustible tank = new DepositoCombustible(100.0,50.0);

	@Test
	public void testGetDepositoNivel() {
		assertEquals(50.0,tank.getDepositoNivel(),0); //valor esperado, resuelto, delta
	}

	@Test
	public void testGetDepositoMax() {
		assertEquals(100.0,tank.getDepositoMax(),0); //valor esperado, resuelto, delta
	}

	@Test
	public void testEstaVacio() {
		assertFalse(tank.estaVacio()); //booleano
	}
	
	@Test
	public void testEstaLleno() {
		assertFalse(tank.estaLleno()); //booleano
	}

}
