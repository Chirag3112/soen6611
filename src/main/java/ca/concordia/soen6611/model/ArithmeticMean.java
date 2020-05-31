package ca.concordia.soen6611.model;

import java.util.ArrayList;

/**
 * 
 * @author surbhi
 *
 */
public class ArithmeticMean {
	
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
