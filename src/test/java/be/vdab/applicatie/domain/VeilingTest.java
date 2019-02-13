package be.vdab.applicatie.domain;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class VeilingTest {
	private Veiling veiling;
	@Before
	public void before() {
		veiling = new Veiling();
	}
	@Test
	public void hetHoogsteBodVanEenNieuweVeilingIsNul() {
		assertEquals(0, veiling.getHoogsteBod());
	}

}
