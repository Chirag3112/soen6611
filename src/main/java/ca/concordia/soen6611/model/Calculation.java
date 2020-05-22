package ca.concordia.soen6611.model;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This class calculates the smallest number(minimum), 
 * largest number(maximum) for a given dataset.
 * @author Jaiganesh
 *
 */
public class Calculation {
	
	 /**
	 * Finds the smallest number in the dataset, given in the form of Integer ArrayList.
	 * @param arg the input dataset containing the number of values
	 * @return min the smallest number in the dataset
	 */
	 public static int findMin(ArrayList<Integer> arg){

	        int min = 0;
	        ArrayList<Integer> list = arg;
	        Collections.sort(list);
	        min = list.get(0);
	        return min;
	        
	 }
	 
	/**
	 * Finds the largest number in the dataset, given in the form of Integer ArrayList.  
	 * @param arg the input dataset containing the number of values
	 * @return max the largest number in the dataset
	 */
	public static int findMax(ArrayList<Integer> arg){

	        int max = 0;
	        ArrayList<Integer> list = arg;
	        Collections.sort(list);
	        max = list.get(list.size() - 1);
	        return max;
	        
	 }

}
