/**
 * 
 */
package ca.concordia.soen6611.client;

import ca.concordia.soen6611.model.StandardDeviation;
import java.util.ArrayList;
import java.util.Scanner;

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
		
		Calculation calculate = new Calculation();
		Dataset dataSet=new Dataset();
		ArithmeticMean aMean= new ArithmeticMean();
		MeanAbsoluteDivision mAD = new MeanAbsoluteDivision();
		StandardDeviation standardD = new StandardDeviation();
		StatisticalController controller=new StatisticalController(calculate, dataSet, aMean, mAD, standardD);
		
		System.out.println("Enter the size of dataset(size >= 1000): ");
		Scanner scan = new Scanner(System.in);
		int dataSize = scan.nextInt();
		while(dataSize < 1000){
			System.out.println("Size is less than 1000. Please enter the size of data-set(>=1000): ");
			dataSize = scan.nextInt();
		}
		ArrayList<Integer> al= dataSet.generateDataset(dataSize);
		System.out.println("Generated data size is " + al.size());
		
		int min = controller.findMinimum(al);
		int max = controller.findMaximum(al);
		int median = controller.findMedian(al);
		int mode = controller.findMode(al);
		float arithmeticMean = controller.findArithmeticMean(al);
		float meanAbsoluteDivision = controller.findMeanAbsoluteDivision(al, arithmeticMean);
		double standardDeviation = controller.findStandardDeviation(al, arithmeticMean);
	
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
