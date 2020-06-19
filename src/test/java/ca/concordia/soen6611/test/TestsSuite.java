/**
 * 
 */
package ca.concordia.soen6611.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ca.concordia.soen6611.test.testmodels.TestArithmeticMean;
import ca.concordia.soen6611.test.testmodels.TestCalculation;
import ca.concordia.soen6611.test.testmodels.TestMeanAbsoluteDivison;
import ca.concordia.soen6611.test.testmodels.TestStandardDeviation;

/**
 * @author chirag
 *
 */
@RunWith(Suite.class)
@SuiteClasses({TestCalculation.class, TestArithmeticMean.class, TestMeanAbsoluteDivison.class, TestStandardDeviation.class})
public class TestsSuite {

}
