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
		System.out.println("Sum " + sumOfAllData + " dataset size " + dataset.size());
		meanAbsolteDivision = sumOfAllData / dataset.size();
		System.out.println("MAD is " + meanAbsolteDivision);
		return meanAbsolteDivision;			
	}		
}
