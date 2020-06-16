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

import ca.concordia.soen6611.model.MeanAbsoluteDivision;

/**
 * @author PIYUSH
 *
 */
public class TestMeanAbsoluteDivison {
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

	//	@SuppressWarnings("deprecation")
	@Test
	public void testForValidFindMeanAbsoluteDivision() {
		MeanAbsoluteDivision mad = new MeanAbsoluteDivision();
		Float result = mad.findMeanAbsoluteDivision(list, 5);
		Float expected = new Float(3.0);
		assertEquals(expected, result, DELTA);
	}

	@Test
	public void testForInvalidFindMeanAbsoluteDivision() {
		MeanAbsoluteDivision mad = new MeanAbsoluteDivision();
		float result = mad.findMeanAbsoluteDivision(list, 5);
		assertNotEquals(2, result);
	}
}
