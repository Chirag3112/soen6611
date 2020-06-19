package ca.concordia.soen6611.model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * This class calculates the smallest number(minimum), 
 * largest number(maximum), median(m) and mode(o) for a given dataset.
 * @author Jaiganesh
 * @author chirag
 *
 */
public class Calculation {
	/**
	 * Finds the smallest number in the dataset, 
	 * given in the form of Integer ArrayList.
	 * @param arg the input dataset containing the number of values
	 * @return min the smallest number in the dataset
	 */
	public int findMin(final ArrayList<Integer> arg){

		int min = 0;
		final ArrayList<Integer> list = arg;
		Collections.sort(list);
		min = list.get(0);
		return min;

	}

	/**
	 * Finds the largest number in the dataset, 
	 * given in the form of Integer ArrayList.  
	 * @param arg the input dataset containing the number of values
	 * @return max the largest number in the dataset
	 */
	public int findMax(final ArrayList<Integer> arg){

		int max = 0;
		final ArrayList<Integer> list = arg;
		Collections.sort(list);
		max = list.get(list.size() - 1);
		return max;

	}

	/**
	 * Finds the median in the dataset, given in the form of Integer ArrayList.  
	 * @param arg the input dataset containing the number of values
	 * @return median the middle number in the dataset
	 */
	public int findMed(final ArrayList<Integer> med) {

		int median=0;
		final ArrayList<Integer> list=med;
		Collections.sort(list);
		if(list.size()%2==0) {
			median= (list.get(list.size()/2)+list.get(list.size()/2 -1))/2;
		}
		else {
			median = list.get(list.size()/2);
		}
		return median;
	}

	/**
	 * Finds the most occuring number in the dataset, 
	 * given in the form of Integer ArrayList.  
	 * @param arg the input dataset containing the number of values
	 * @return mode the most occuring number in the dataset
	 */
	public int findMod(final ArrayList<Integer> mod) {
		final ArrayList<Integer> list=mod;
		Collections.sort(list);
		int max = 0;
		int curr = 0;
		Integer modeElement =  null;

		final Set<Integer> unique = new HashSet<>(list);

		for (final Integer key : unique) {
			curr = Collections.frequency(list, key);

			if(max < curr){
				max = curr;
				modeElement = key;
			}
		}
		return modeElement;
	}
}
