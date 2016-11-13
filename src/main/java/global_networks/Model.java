package global_networks;

import java.util.ArrayList;

/**
 * Created by Christina on 12-Nov-16.
 */
public class Model {

    /**
     * Array of input values.
     */
    private ArrayList<Integer> numbers = new ArrayList<>();

    public void setNumbers(ArrayList<Integer> numbers) {

        this.numbers = numbers;
    }

    /**
     * Method counts the arithmetic mean of input values.
     * @return
     */
    public double countArithmeticMean() {
        double sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return (sum / numbers.size());
    }

    /**
     * Method rounds the arithmetic mean.
     * @param arithmeticMean
     * @return
     */
    public int roundArithmeticMean(double arithmeticMean) {

        return (int) Math.round(arithmeticMean);
    }
}
