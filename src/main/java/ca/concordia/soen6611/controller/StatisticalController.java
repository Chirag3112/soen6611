/**
 * 
 */
package ca.concordia.soen6611.controller;

import java.util.ArrayList;

import ca.concordia.soen6611.model.ArithmeticMean;
import ca.concordia.soen6611.model.Calculation;
import ca.concordia.soen6611.model.Dataset;
import ca.concordia.soen6611.model.MeanAbsoluteDivision;

/**
 * This class is the controller for all other classes
 * @author chirag
 *
 */
public class StatisticalController {

	private Calculation calculate;
	private Dataset dataSet;
	private ArithmeticMean aMean;
	private MeanAbsoluteDivision meanAbsoluteDivision;
	
	public StatisticalController(Calculation calculate, Dataset dataSet, ArithmeticMean aMean, MeanAbsoluteDivision meanAbsoluteDivision) 
	{ 
		this.calculate= calculate;
		this.dataSet= dataSet;
		this.aMean= aMean;
		this.meanAbsoluteDivision = meanAbsoluteDivision;
	}

	public ArrayList<Integer> generateDataset(int n){
		return dataSet.generateDataset(n);
	}

	public int findMinimum(ArrayList<Integer> arg) {
		return calculate.findMin(arg);
	}

	public int findMaximum(ArrayList<Integer> arg) {
		return calculate.findMax(arg);
	}

	public int findMedian(ArrayList<Integer> med) {
		return calculate.findMed(med);
	}

	public int findMode(ArrayList<Integer> mod) {
		return calculate.findMod(mod);
	}
	
	public int findArithmeticMean(ArrayList<Integer> amean) {
		return aMean.findArithmeticMean(amean);
	}
	
	/**
	 * @param mad data-set on which MAD calculation to be performed
	 * @param arithmeticMean
	 * @return the MAD value for a given data-set
	 */
	public float findMeanAbsoluteDivision(ArrayList<Integer> mad, int arithmeticMean){
		return meanAbsoluteDivision.findMeanAbsoluteDivision(mad, arithmeticMean);
//		System.out.println("Result in controller is " + answer);
//		return answer;
	}
}
