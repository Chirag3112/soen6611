/**
 * 
 */
package ca.concordia.soen6611.model;

import java.util.ArrayList;

/**
 * @author PIYUSH
 *
 */
public class MeanAbsoluteDivision {
	
	/**
	 * @param dataset on which MAD calculation to be performed
	 * @param arithmeticMean which is used to calculate MAD
	 * @return meanAbsolteDivision
	 */
	public float findMeanAbsoluteDivision(ArrayList<Integer> dataset, int arithmeticMean){
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
		
		return meanAbsolteDivision;			
	}		
}
