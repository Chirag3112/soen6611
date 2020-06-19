/**
 * 
 */
package ca.concordia.soen6611.model;

import java.text.DecimalFormat;
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
	public float findMeanAbsoluteDivision(final ArrayList<Integer> dataset, final float arithmeticMean){
		float mAD = 0;			
		float sumOfAllData = 0;

		for(final int element : dataset){
			if(element - arithmeticMean < 0){
				sumOfAllData = sumOfAllData - (element - arithmeticMean);
			} else {
				sumOfAllData = sumOfAllData + (element - arithmeticMean);
			}
			sumOfAllData = sumOfAllData + (element - arithmeticMean);
		}
		
		mAD = sumOfAllData / dataset.size();
		final DecimalFormat format = new DecimalFormat("#.##");
		mAD = Float.parseFloat(format.format(mAD));
		
		return mAD;			
	}		
}
