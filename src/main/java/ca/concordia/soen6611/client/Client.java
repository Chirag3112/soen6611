/**
 * 
 */
package ca.concordia.soen6611.client;

import java.util.ArrayList;
import java.util.Scanner;

import ca.concordia.soen6611.controller.StatisticalController;
import ca.concordia.soen6611.model.ArithmeticMean;
import ca.concordia.soen6611.model.Calculation;
import ca.concordia.soen6611.model.Dataset;
import ca.concordia.soen6611.model.MeanAbsoluteDivision;
import ca.concordia.soen6611.model.StandardDeviation;

/**
 * This is the main class that triggers controller 
 * to perform various action on different functionalities.
 * @author Jaiganesh
 * @author chirag
 * @author PIYUSH
 */
public final class Client {
	/** 
	 * This is the main method that is executed 
	 * first over the whole application. 
	 * @param args
	 */
	public static void main(final String[] args) {
		final Calculation calculate = new Calculation();
		final Dataset dataSet=new Dataset();
		final ArithmeticMean aMean= new ArithmeticMean();
		final MeanAbsoluteDivision mAD = new MeanAbsoluteDivision();
		final StandardDeviation standardD = new StandardDeviation();
		final StatisticalController controller=new StatisticalController(calculate, dataSet, aMean, mAD, standardD);

		System.out.println("Enter the size of dataset(size >= 1000): ");
		final Scanner scan = new Scanner(System.in);
		int dataSize = scan.nextInt();
		while(dataSize < 1000){
			System.out.println("Size is less than 1000. Please enter the size of data-set(>=1000): ");
			dataSize = scan.nextInt();
		}
		scan.close();
		final ArrayList<Integer> arrayList= dataSet.generateDataset(dataSize);
		System.out.println("Generated data size is " + arrayList.size());

		final int min = controller.findMinimum(arrayList);
		final int max = controller.findMaximum(arrayList);
		final int median = controller.findMedian(arrayList);
		final int mode = controller.findMode(arrayList);
		final float arithmeticMean = controller.findArithmeticMean(arrayList);
		final float meanAbsoluteDivision = controller.findMeanAbsoluteDivision(arrayList, arithmeticMean);
		final double standardDeviation = controller.findStandardDeviation(arrayList, arithmeticMean);
			    
		System.out.println("*********************************************");
		System.out.println("Minimum is " + min);
		System.out.println("Maximum is " + max);
		System.out.println("Median is " + median);
		System.out.println("Mode is " + mode);
		System.out.println("Arithmetic Mean(AM) calculated is " + arithmeticMean);
		System.out.println("Mean Absolute Division(MAD) is " + meanAbsoluteDivision);
		System.out.println("Standard Deviation is " + standardDeviation);
		System.out.println("*********************************************");
	}
}
