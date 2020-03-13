package test.model.signs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.signs.Devide;

public class DevideTest {

	@Test
	public void countTest() {
		//when
		double x = 2;
		double y = 2;
		Devide devide = new Devide();
		//then
		double result = devide.count(x, y);
		//given
		assertTrue(result == 1);
	}
	
}
