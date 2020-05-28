/**
 * 
 */
package ca.concordia.soen6611.client;

import java.util.ArrayList;

/**
 * @author PIYUSH
 *
 */
public class CalculateMAD {
	/**
	 * @return the MAD value for given dataset
	 */
	public float calculateMeanAbsoluteDivision(ArrayList<Integer> dataset, float arithmeticMean){
		float meanAbsolteDivision = 0;
		float sumOfAllData = 0;
		for(int element : dataset){
			if(element - arithmeticMean < 0){
				sumOfAllData = sumOfAllData - (element - arithmeticMean);
			} else {
				sumOfAllData = sumOfAllData + (element - arithmeticMean);
			}
			sumOfAllData = sumOfAllData +(element - arithmeticMean);
		}
		meanAbsolteDivision = sumOfAllData / dataset.size();
//		System.out.println("MAD is " + meanAbsolteDivision);
		return meanAbsolteDivision;
	}
}
