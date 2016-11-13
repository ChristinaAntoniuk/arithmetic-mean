package global_networks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit tests for Model class of ArithmeticMean project.
 */

public class ArithmeticMeanModelTest extends Assert {

    static Model model;
    ArrayList<Integer> numbers;
    double arithmeticMean;
    int roundedArithmeticMean;

    @Before
    public void setData(){
        model = new Model();
        numbers = new ArrayList<>(Arrays.asList(12, 18, 19, 916, 237, 199));
        arithmeticMean = 233.5;
        roundedArithmeticMean = 234;

    }

    /**
     * Test of counting arithmetic mean of numbers.
     */
    @Test
    public void arithmeticMeanTest(){
        model.setNumbers(numbers);
        assertEquals(arithmeticMean, model.countArithmeticMean(), 0.0001);
    }

    /**
     * Test of rounding double value.
     */
    @Test
    public void roundedArithmeticMeanTest(){
        model.setNumbers(numbers);
        assertEquals(roundedArithmeticMean, model.roundArithmeticMean(arithmeticMean));
    }
}
