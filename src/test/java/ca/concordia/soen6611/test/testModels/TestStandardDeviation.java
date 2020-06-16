/**
 * 
 */
package ca.concordia.soen6611.test.testModels;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import ca.concordia.soen6611.model.StandardDeviation;

/**
 * @author PIYUSH
 *
 */
public class TestStandardDeviation {
	ArrayList<Integer> list;
	private static final double DELTA = 1e-15;
	StandardDeviation sd;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		list = new ArrayList<>();
		list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		sd = new StandardDeviation();
	}

	@Test
	public void testForValidFindStandardDeviation() {
		double result = sd.findStandardDeviation(list, 5);
		assertEquals(new Double(2.92), result, DELTA);
	}

	@Test
	public void testForInvalidFindStandardDeviation() {
		double result = sd.findStandardDeviation(list, 5);
		assertNotEquals(new Double(3.0), result);
	}

	@Test
	public void testForValidPower() {
		double result = sd.power(2);
		assertEquals(new Double(4.0), result, DELTA);
	}

	@Test
	public void testForInvalidPower() {
		double result = sd.power(1.5);
		assertNotEquals(new Double(4.0), result);
	}

	@Test
	public void testForValidSqrt() {
		double result = sd.sqrt(16);
		assertEquals(new Double(4.0), result, DELTA);
	}

	@Test
	public void testForInvalidSqrt() {
		double result = sd.sqrt(15);
		assertNotEquals(new Double(4.0), result);
	}
}
