/**
 * 
 */
package ca.concordia.soen6611.client;

import java.util.ArrayList;

import ca.concordia.soen6611.controller.StatisticalController;
import ca.concordia.soen6611.model.ArithmeticMean;
import ca.concordia.soen6611.model.Calculation;
import ca.concordia.soen6611.model.Dataset;
import ca.concordia.soen6611.model.MeanAbsoluteDivision;

/**
 * This is the main class that triggers controller 
 * to perform various action on different functionalities.
 * @author Jaiganesh
 * @author chirag
 * @author PIYUSH
 */
public class Client {

	/** 
	 * This is the main method that is executed 
	 * first over the whole application. 
	 * @param args
	 */
	public static void main(final String[] args) {
		
		Calculation calculate=new Calculation();
		Dataset dataSet=new Dataset();
		ArithmeticMean aMean= new ArithmeticMean();
		MeanAbsoluteDivision mAD = new MeanAbsoluteDivision();
		StatisticalController controller=new StatisticalController(calculate, dataSet, aMean, mAD);
		
		ArrayList<Integer> al= dataSet.generateDataset(1000);
		System.out.println(al.size());
		
		int min = controller.findMinimum(al);
		int max = controller.findMaximum(al);
		int median = controller.findMedian(al);
		int mode = controller.findMode(al);
		int arithmeticMean= controller.findArithmeticMean(al);
		float meanAbsoluteDivision = controller.findMeanAbsoluteDivision(al, arithmeticMean);
		double standardDeviation = controller.findStandardDeviation(al, arithmeticMean);
	
		System.out.println("Minimum is " + min);
		System.out.println("Maximum is " + max);
		System.out.println("Median is " + median);
		System.out.println("Mode is " + mode);
		System.out.println("Arithmetic Mean calculated is " + arithmeticMean);
		System.out.println("Mean Absolute Division(MAD) is " + meanAbsoluteDivision);
		System.out.println("StandardDeviation  is " + standardDeviation);



	}
}
