package ca.concordia.soen6611.model;

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
	public int findArithmeticMean(ArrayList<Integer> arg) {
		int sum=0;
		ArrayList<Integer> dataset= arg;
		for(int i=0; i<dataset.size(); i++) {
			sum= sum + dataset.get(i);
		}
		int arithmeticMean= (sum) / (dataset.size());
		return arithmeticMean;
	}
}
