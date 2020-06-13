/**
 * 
 */
package ca.concordia.soen6611.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ca.concordia.soen6611.test.testModels.TestArithmeticMean;
import ca.concordia.soen6611.test.testModels.TestCalculation;
import ca.concordia.soen6611.test.testModels.TestMeanAbsoluteDivison;

/**
 * @author chirag
 *
 */
@RunWith(Suite.class)
@SuiteClasses({TestCalculation.class, TestArithmeticMean.class, TestMeanAbsoluteDivison.class})
public class TestsSuite {

}
