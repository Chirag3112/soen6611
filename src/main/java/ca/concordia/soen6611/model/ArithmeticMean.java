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
	public float findArithmeticMean(ArrayList<Integer> arg) {
		int sum=0;
		float arithmeticMean = 0;
		ArrayList<Integer> dataset = arg;
		for(int i=0; i<dataset.size(); i++) {
			sum = sum + dataset.get(i);
		}
		arithmeticMean = ((float)sum / (float)dataset.size());
		DecimalFormat format = new DecimalFormat("#.##");
		arithmeticMean = Float.parseFloat(format.format(arithmeticMean));
		return arithmeticMean;
	}
}
