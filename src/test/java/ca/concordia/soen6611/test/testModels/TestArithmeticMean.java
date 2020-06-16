/**
 * 
 */
package ca.concordia.soen6611.test.testModels;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ca.concordia.soen6611.model.ArithmeticMean;

/**
 * @author PIYUSH
 *
 */
public class TestArithmeticMean {

	ArrayList<Integer> list;
	private static final double DELTA = 1e-15;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		list = new ArrayList<>();
		list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testForValidFindArithmeticMean() {
		ArithmeticMean am = new ArithmeticMean();
		float result = am.findArithmeticMean(list);
		assertEquals(new Float(5.5), result, DELTA);
	}

	@Test
	public void testForInvalidFindArithmeticMean() {
		ArithmeticMean am = new ArithmeticMean();
		float result = am.findArithmeticMean(list);
		assertNotEquals(5, result);
	} 

}
