/**
 * 
 */
package ca.concordia.soen6611.model;

/**
 * @author chirag
 *
 */
public class ArithmeticVariables {
	int min;
	int max;
	float median;
	float arithmeticMean;
	float meanAbsoluteDivision;
	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}
	/**
	 * @param min the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}
	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}
	/**
	 * @param max the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}
	/**
	 * @return the median
	 */
	public float getMedian() {
		return median;
	}
	/**
	 * @param median the median to set
	 */
	public void setMedian(float median) {
		this.median = median;
	}
	/**
	 * @return the arithmetic mean
	 */
	public float getArithmeticMean() {
		return arithmeticMean;
	}
	/**
	 * @param arithmeticMean the mean to set
	 */
	public void setArithmeticMean(float arithmeticMean) {
		this.arithmeticMean = arithmeticMean;
	}
	/**
	 * @return mean absolute division(MAD)
	 */
	public float getMeanAbsoluteDivision() {
		return meanAbsoluteDivision;
	}
	/**
	 * @param meanAbsoluteDivision the MAD to set
	 */
	public void setMeanAbsoluteDivision(float meanAbsoluteDivision) {
		this.meanAbsoluteDivision = meanAbsoluteDivision;
	}
}
