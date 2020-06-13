/**
 * 
 */
package ca.concordia.soen6611.controller;

import ca.concordia.soen6611.model.StandardDeviation;
import java.util.ArrayList;

import ca.concordia.soen6611.model.ArithmeticMean;
import ca.concordia.soen6611.model.Calculation;
import ca.concordia.soen6611.model.Dataset;
import ca.concordia.soen6611.model.MeanAbsoluteDivision;

/**
 * This class is the controller for all other classes
 * @author chirag
 * @author PIYUSH
 */
public class StatisticalController {

	private Calculation calculate;
	private Dataset dataSet;
	private ArithmeticMean aMean;
	private MeanAbsoluteDivision meanAbsoluteDivision;
	private StandardDeviation sd;
	
	/**
	 * This is the constructor that initializes the class properties
	 * @param calculate
	 * @param dataSet
	 * @param aMean
	 * @param meanAbsoluteDivision
	 */
	public StatisticalController(Calculation calculate, Dataset dataSet, ArithmeticMean aMean, MeanAbsoluteDivision meanAbsoluteDivision,StandardDeviation standardD) 
	{ 
		this.calculate= calculate;
		this.dataSet= dataSet;
		this.aMean= aMean;
		this.meanAbsoluteDivision = meanAbsoluteDivision;
		this.sd=standardD;
	}

	/**
	 * This method generates the data set of a given size
	 * @param n integer value of size passed as parameter
	 * @return the data-set of a given size
	 */
	public ArrayList<Integer> generateDataset(int n){
		return dataSet.generateDataset(n);
	}

	/**
	 * This method finds the minimum element from the data set
	 * @param arg data set passed as method parameter
	 * @return minimum value from data set
	 */
	public int findMinimum(ArrayList<Integer> arg) {
		return calculate.findMin(arg);
	}

	/**
	 * This method finds the maximum element from the data set
	 * @param arg data set passed as method parameter
	 * @return maximum value from data set
	 */
	public int findMaximum(ArrayList<Integer> arg) {
		return calculate.findMax(arg);
	}

	/**
	 * This method finds the median of the data set
	 * @param med data set passed as method parameter
	 * @return median value of the data set
	 */
	public int findMedian(ArrayList<Integer> med) {
		return calculate.findMed(med);
	}

	/**
	 * This method finds the mode of the data set
	 * @param mod data set passed as method parameter
	 */
	public int findMode(ArrayList<Integer> mod) {
		return calculate.findMod(mod);
	}
	
	/**
	 * This method finds the arithmetic mean of the data set
	 * @param amean data set passed as method parameter
	 * @return the AM value of the data set
	 */
	public float findArithmeticMean(ArrayList<Integer> amean) {
		return aMean.findArithmeticMean(amean);
	}
	
	/**
	 * @param mad data-set on which MAD calculation to be performed
	 * @param arithmeticMean
	 * @return the MAD value of the data set
	 */
	public float findMeanAbsoluteDivision(ArrayList<Integer> mad, float arithmeticMean){
		return meanAbsoluteDivision.findMeanAbsoluteDivision(mad, arithmeticMean);
	}

	/**
	 * This method finds the Standard Deviation of dataSet
	 * @param data
	 * @param arithmeticMean
	 * @return  Standard Deviation of dataSet
	 */
	public double findStandardDeviation(ArrayList<Integer> data, float arithmeticMean){
		return  sd.findStandardDeviation(data, arithmeticMean);
	}
}
