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
	@Test
	public void naEenEersteBodIsHetHoogsteBodGelijkAanHetBedragVanDitBod() {
		veiling.doeBod(100);
		assertEquals(100, veiling.getHoogsteBod());
	}
	@Test
	public void hetHoogsteBodNaEerst100Dan200Dan150is200() {
		veiling.doeBod(100);
		veiling.doeBod(200);
		veiling.doeBod(150);
		assertEquals(200, veiling.getHoogsteBod());
	}

}
