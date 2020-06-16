package ca.concordia.soen6611.model;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * This class creates the input dataset by generating 
 * random numbers and storing them in an ArrayList.
 * @author Jaiganesh
 *
 */
public class Dataset {

	/**
	 * Generates n random numbers between the range 0 to 1000
	 * @param n the maximum number of values in the dataset
	 * @return dataset the dataset containing n values between 0 and 1000
	 */
	public ArrayList<Integer> generateDataset(int n){

		Random rand = new Random();
		ArrayList<Integer> dataset = new ArrayList<Integer>();

		for(int i = 0; i < n; i++){
			int num= rand.nextInt(1000);
			dataset.add(num);
		}
		return dataset;
	}
}


