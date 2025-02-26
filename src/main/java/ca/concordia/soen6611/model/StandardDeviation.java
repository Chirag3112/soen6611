/**
 * 
 */
package ca.concordia.soen6611.model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * @author Bin
 *
 */
public class StandardDeviation {

    /**
     * This function is used to do square calculation
     * @param m The number you want to square
     * @return squares
     */
    public double power(final double m){
        return m * m;
    }

    /**
     * This function is used to do sqrt calculation
     * @param m The number you want to sqrt
     * @return sqrt
     */

    public double sqrt(final double m) {
        double i = 0;
        while ((i * i) <= m) {
            i += 0.1;
        }
        for (int j = 0; j < 10; j++) {
            i = (m / i + i) / 2;
        }
        return i;
    }

    /**
     *This function is used to calculate StandardDeviation
     * @param data The dataSet consisted of series Integer numbers
     * @param mean Arithmetic Mean
     * @return StandardDeviation
     */
    public double findStandardDeviation (final ArrayList<Integer> data, final float mean ){
        double sum = 0;
        double result;
        for(final double number : data){
            sum += power(number - mean);
        }
        result = sqrt(sum / data.size());
        final DecimalFormat format = new DecimalFormat("#.##");
        result = Double.parseDouble(format.format(result));
        return result;
    }

}
