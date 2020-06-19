package ca.concordia.soen6611.model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * 
 * @author surbhi
 *
 */
public class ArithmeticMean {
	/**
	 * This method calculates the arithmetic mean of the data set.
	 * @param arg the data set passed as method parameter
	 * @return arithmeticMean
	 */
	public float findArithmeticMean(final ArrayList<Integer> arg) {
		int sum=0;
		float arithmeticMean = 0;
		final ArrayList<Integer> dataset = arg;
		for (final Integer i : dataset) {
			sum=sum+i;
		}
		arithmeticMean = (float)sum / (float)dataset.size();
		final DecimalFormat format = new DecimalFormat("#.##");
		arithmeticMean = Float.parseFloat(format.format(arithmeticMean));
		return arithmeticMean;
	}
}
