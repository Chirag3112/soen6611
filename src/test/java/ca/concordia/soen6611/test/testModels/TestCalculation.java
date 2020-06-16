/**
 * 
 */
package ca.concordia.soen6611.test.testModels;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ca.concordia.soen6611.model.Calculation;

/**
 * @author PIYUSH
 *
 */
public class TestCalculation {
	ArrayList<Integer> list;
	Calculation calculate;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		list = new ArrayList<>();
		list.addAll(Arrays.asList(1,2,3,4,1,6,1,8,2,10));
		calculate = new Calculation();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testForValidFindMin() {
		int min = calculate.findMin(list);
		assertEquals(1, min);
	}

	@Test
	public void testForValidFindMax() {
		int max = calculate.findMax(list);
		assertEquals(10, max);
	}

	@Test
	public void testForValidFindMed() {
		int median = calculate.findMed(list);
		assertEquals(2, median);
	}

	@Test
	public void testForValidFindMod() {
		int mode = calculate.findMod(list);
		assertEquals(1, mode);
	}
}
