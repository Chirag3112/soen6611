/**
 * 
 */
package ca.concordia.soen6611.client;

import java.util.ArrayList;

import ca.concordia.soen6611.controller.StatisticalController;
import ca.concordia.soen6611.model.Calculation;
import ca.concordia.soen6611.model.Dataset;

/**
 * @author Jaiganesh
 * @author chirag
 *
 */
public class Client {

	public static void main(final String[] args) {
		Calculation calculate=new Calculation();
		Dataset dataSet=new Dataset();
		StatisticalController controller=new StatisticalController(calculate,dataSet);
		
		ArrayList<Integer> al= dataSet.generateDataset(1000);
		System.out.println(al.size());
		
		int min = controller.findMinimum(al);
		int max = controller.findMaximum(al);
		int median = controller.findMedian(al);
		int mode = controller.findMode(al);
	
		System.out.println(min);
		System.out.println(max);
		System.out.println(median);
		System.out.println(mode);
		
		
	}
}
