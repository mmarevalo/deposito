package depositoCombustible;

import static org.junit.Assert.*;


import org.junit.Test;

public class CombustibleTestParam {

	private static DepositoCombustible tank = new DepositoCombustible(100.0,50.0);
	private static double a = 30.0, b = -30;
	
	@Test
	public void testFill() {
		tank.fill(a);
		assertEquals(80.0,tank.getDepositoNivel(),0); //valor esperado, resuelto, delta
		tank.fill(b);
		assertEquals(50.0,tank.getDepositoNivel(),0); //valor esperado, resuelto, delta
	}

	@Test
	public void testConsumir() {
		tank.consumir(b);
		assertEquals(80.0,tank.getDepositoNivel(),0); //valor esperado, resuelto, delta
		tank.consumir(a);
		assertEquals(50.0,tank.getDepositoNivel(),0); //valor esperado, resuelto, delta
	}


}
